package nani;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class RTFToTextConverterFromDb {
 
    public static void main(String[] args) throws IOException, BadLocationException {
        // Database connection details
        String url = "mailto:jdbc:oracle:thin:@tordb111.od.cssdom.com:1521:qmatotst";
        String user = "db_o";
        String password = "x";
 
        Connection connection = null;
        PreparedStatement selectStatement = null;
        PreparedStatement insertStatement = null;
        PreparedStatement checkDuplicateStmt = null;
        ResultSet resultSet = null;
 
        try {
            // Establishing connection to the database
            connection = DriverManager.getConnection(url, user, password);
 
            // Select query to fetch job IDs and safety_desc
            String selectQuery = "SELECT JOb_OId, safety_desc FROM JOB_SAFETY WHERE safety_desc is not null AND job_oid not in (select distinct job_oid from JOB_SAFETY_CONVERTED_TEXT)";
            selectStatement = connection.prepareStatement(selectQuery);
            resultSet = selectStatement.executeQuery();
 
            // Prepare insert query
            String insertQuery = "INSERT INTO JOB_SAFETY_CONVERTED_TEXT (job_oid, safety_desc, safety_desc_text) VALUES (?, ?, ?)";
            insertStatement = connection.prepareStatement(insertQuery);
 
            // Prepare statement to check for duplicate job_oid
            String checkDuplicateQuery = "SELECT 1 FROM JOB_SAFETY_CONVERTED_TEXT WHERE job_oid = ?";
            checkDuplicateStmt = connection.prepareStatement(checkDuplicateQuery);
 
            int rowIndex = 0;
            while (resultSet.next()) {
                int jobOid = resultSet.getInt("JOb_OId");
                byte[] rtfBytes = resultSet.getBytes("safety_desc");
 
                // Check for duplicate job_oid
                if (isDuplicateJobOid(checkDuplicateStmt, jobOid)) {
                    System.out.println("Skipping duplicate job_oid: " + jobOid);
                    continue;
                }
 
                // Convert the RTF data to plain text
                String plainText = convertRTFToPlainText(rtfBytes);
 
                // Convert plain text to a CLOB
                Clob plainTextClob = connection.createClob();
                plainTextClob.setString(1, plainText);
 
                // Set parameters for the insert statement using values from the result set
                insertStatement.setInt(1, jobOid);
                insertStatement.setBytes(2, rtfBytes);
                insertStatement.setClob(3, plainTextClob);
 
                // Execute the insert statement
                insertStatement.executeUpdate();
 
                rowIndex++;
                if (rowIndex % 100 == 0) {
                    System.out.println("Processed " + rowIndex + " rows...");
                }
 
                // Print the job ID
                System.out.println("Inserted job ID: " + jobOid);
            }
 
            System.out.println("Data extraction and insertion completed.");
 
        } catch (SQLException ex) {
            Logger.getLogger(RTFToTextConverter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close all resources
            closeResources(resultSet, selectStatement, insertStatement, checkDuplicateStmt, connection);
        }
    }
 
    // Method to check if job_oid already exists in the target table
    private static boolean isDuplicateJobOid(PreparedStatement checkDuplicateStmt, int jobOid) throws SQLException {
        checkDuplicateStmt.setInt(1, jobOid);
        ResultSet rs = checkDuplicateStmt.executeQuery();
        return rs.next();
    }
 
    // Method to close resources
    private static void closeResources(ResultSet resultSet, PreparedStatement selectStatement, PreparedStatement insertStatement, PreparedStatement checkDuplicateStmt, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (selectStatement != null) {
                selectStatement.close();
            }
            if (insertStatement != null) {
                insertStatement.close();
            }
            if (checkDuplicateStmt != null) {
                checkDuplicateStmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(RTFToTextConverter.class.getName()).log(Level.SEVERE, "Failed to close resources", ex);
        }
    }
 
    // Method to convert RTF bytes to plain text
    private static String convertRTFToPlainText(byte[] rtfBytes) throws IOException, BadLocationException {
        if (rtfBytes == null) {
            return "";
        }
 
        InputStream inputStream = null;
        try {
            inputStream = new ByteArrayInputStream(rtfBytes);
            RTFEditorKit rtfEditorKit = new RTFEditorKit();
            DefaultStyledDocument document = new DefaultStyledDocument();
            rtfEditorKit.read(inputStream, document, 0);
            return document.getText(0, document.getLength());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(RTFToTextConverter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}