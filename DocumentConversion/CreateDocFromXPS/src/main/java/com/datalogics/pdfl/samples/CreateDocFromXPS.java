package com.datalogics.pdfl.samples;

import java.util.EnumSet;

import com.datalogics.PDFL.Document;
import com.datalogics.PDFL.Library;
import com.datalogics.PDFL.SaveFlags;
import com.datalogics.PDFL.XPSConvertParams;

/*
* This sample demonstrates converting an XPS file into a PDF document.
 * 
 * XML Paper Specification (XPS) is a standard document format that Microsoft created in 2006
 * as an alternative to the PDF format.  
 *
 * Copyright (c) 2007-2023, Datalogics, Inc. All rights reserved.
 *
 */

public class CreateDocFromXPS {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
        System.out.println("CreateDocFromXPS sample:");

    	Library lib = new Library();

		try {
            // First, create an XPSConvertParams to specify conversion parameters 
            // for creating the document.
            XPSConvertParams xpsparams = new XPSConvertParams();
            
            // Use a .joboptions file to specify settings for XPS conversion.
            // A default .joboptions file is provided in the Resources directory of 
            // the distribution.  This file is used by default, but a custom file
            // can be used instead by setting the pathToSettingsFile property.
            System.out.println("Using settings file located at: " + xpsparams.getPathToSettingsFile());
            
            // Create the document.
            System.out.println("Creating a document from an XPS file...");
	        Document doc = new Document(Library.getResourceDirectory() + "Sample_Input/brownfox.xps", xpsparams);
	        
            // Save the document.
            System.out.println("Saving the document...");
            doc.save(EnumSet.of(SaveFlags.FULL), "CreateDocFromXPS-out.pdf");                
		}
		finally {
			lib.delete();
		}
	}

}
