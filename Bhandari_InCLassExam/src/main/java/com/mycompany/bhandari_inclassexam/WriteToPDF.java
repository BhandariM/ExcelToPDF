/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bhandari_inclassexam;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author S525703
 */
public class WriteToPDF {
    
     public WriteToPDF() {
    }
    
    
    public void writeToPDF(List<Accounts> account) throws BadElementException, IOException {
        
       int a=1;
      try
      {
         
         for(int i=1;i<account.size();i++){
             String s=account.get(i).getLastName();
             String b=s+".pdf";
             Document document = new Document();
             PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(b));
             document.open();
             String imageURL = "1.png";
             Image img = Image.getInstance(imageURL);
             document.add(img);
             
             document.add(new Paragraph("Welcome! "+account.get(i).getFirstName()+" "+account.get(i).getLastName()+"!"));
             document.add(new Paragraph("Below are your account details"));
             document.add(new Paragraph("LastName:"+account.get(i).getLastName()));
             document.add(new Paragraph("FirstName:"+account.get(i).getFirstName()));
             document.add(new Paragraph("AccountNumber:"+account.get(i).getAccountNumber()));
             document.add(new Paragraph("AccountBalance:"+account.get(i).getAccountBalance()));
              document.close();
                writer.close();
                
         }
         
        
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      } 
    }
    
}
