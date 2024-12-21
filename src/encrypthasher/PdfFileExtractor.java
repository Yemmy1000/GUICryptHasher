/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypthasher;

import java.io.File;

import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class PdfFileExtractor {
    
        String textContent;
    public String getPdfContent(String inputFile) throws IOException {   
        
        File file = new File(inputFile);
        PDDocument document = Loader.loadPDF(file);         
        PDFTextStripper pdfStripper = new PDFTextStripper();
        textContent = pdfStripper.getText(document);

//       document.close();
       
        return textContent;
    }
    
    
    
    
}
