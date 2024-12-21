/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypthasher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;





class WordExtractor {


    String textContent;
    public String getFileContent(String inputFile) throws FileNotFoundException, InvalidFormatException, IOException {   
                File file = new File(inputFile);
                FileInputStream fs = new FileInputStream(file);
               OPCPackage d = OPCPackage.open(fs);
               XWPFWordExtractor wx = new XWPFWordExtractor(d);               
               textContent = wx.getText();
       
        return textContent;
    }
}


