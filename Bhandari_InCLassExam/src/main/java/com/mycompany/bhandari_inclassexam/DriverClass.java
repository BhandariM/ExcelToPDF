/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bhandari_inclassexam;

import com.itextpdf.text.BadElementException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author S525703
 */
public class DriverClass {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BadElementException, IOException {
        // TODO code application logic here
        ReadFromExcel rd = new ReadFromExcel();
         List accountDetails = rd.getAccountDetailsFromExcel();
        
//         InsertingIntoDatabase db = new InsertingIntoDatabase();
//         db.insertData(accountDetails);
//         System.out.println("Data inserted succesfully");

        WriteToPDF wr = new WriteToPDF();
        wr.writeToPDF(accountDetails);
    }
    
}
