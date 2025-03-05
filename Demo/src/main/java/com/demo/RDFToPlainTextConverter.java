package com.demo;

public class RDFToPlainTextConverter {
	 public static void main(String[] args) {
	        String rdfFilePath = "C:/Users/DELL/Downloads/rows.rdf";

	        // Create an empty model
	        Model model = ModelFactory.createDefaultModel();

	        // Use FileManager to open the RDF file
	        InputStream in = FileManager.get().open(rdfFilePath);
	        if (in == null) {
	            throw new IllegalArgumentException("File: " + rdfFilePath + " not found");
	        }

	        // Read the RDF/XML file
	        model.read(in, null);

	        // Iterate over all statements in the model
	        StmtIterator iter = model.listStatements();
	        while (iter.hasNext()) {
	            Statement stmt = iter.nextStatement();
	            Resource subject = stmt.getSubject();
	            Property predicate = stmt.getPredicate();
	            RDFNode object = stmt.getObject();

	            // Check if object is a literal
	            if (object.isLiteral()) {
	                Literal literal = object.asLiteral();
	                String textValue = literal.getLexicalForm();
	                System.out.println(textValue); // Output the plain text
	            }
	        }
	    }

}
