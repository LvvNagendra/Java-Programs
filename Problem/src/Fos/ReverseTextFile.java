package Fos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseTextFile {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Read content from input file
            String content = readFromFile(inputFile);

            // Reverse the content
            String reversedContent = reverseText(content);

            // Write reversed content to output file
            writeToFile(outputFile, reversedContent);

            System.out.println("Content reversed and written to output.txt");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }

     public static void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }
  public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}