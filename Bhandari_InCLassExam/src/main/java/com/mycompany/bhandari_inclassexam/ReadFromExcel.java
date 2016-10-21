/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bhandari_inclassexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author S525703
 */
public class ReadFromExcel {
    
    private static final String FILE_PATH = "Bhandari_Input.xlsx";

   
/*
    * method to get list of movies from the input excel file
*/
    public  List getAccountDetailsFromExcel() {
        List accountDetails = new ArrayList();
        FileInputStream fis = null;
         
        try {
            fis = new FileInputStream(FILE_PATH);

            
            /*
              Use XSSF for xlsx format, for xls use HSSF
            */
            Workbook workbook = new XSSFWorkbook(fis);

            int numberOfSheets = workbook.getNumberOfSheets();

          
            
            /*
            looping over each workbook sheet
            */
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Iterator rowIterator = sheet.iterator();

                
            /*
                iterating over each row
                */
                while (rowIterator.hasNext()) {

                    Accounts account = new Accounts();
                    Row row = (Row) rowIterator.next();
                    
                    
                  
                         Iterator cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                       
                        Cell cell = (Cell) cellIterator.next();
                     
                   
                        /*
                        checking if the cell is having a String value .
                        */
                        if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                           
                            
                            /*
                            Cell with index 1 contains Album name 
                            */
                            if (cell.getColumnIndex() == 0) {
                                 account.setFirstName(cell.getStringCellValue());
                                 System.out.println(cell.getStringCellValue());
                            }
                            if (cell.getColumnIndex() == 1) {
                                 account.setLastName(cell.getStringCellValue());
                            }
                            
                            /*
                      
                            Cell with index 3 contains Artist name
                            */
                            if (cell.getColumnIndex() == 2) {
                                 account.setAccountNumber(cell.getStringCellValue());
                            }
                     
                        }
                        
                        /*
                         checking if the cell is having a numeric value
                        */
                        else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {

                            
                            /*
                            Cell with index 0 contains Sno
                            */
                            if (cell.getColumnIndex() == 3) {
                                account.setAccountBalance((int) cell.getNumericCellValue());
                            }
                            
                           

                        }
                    
                    }
                    
                    /*
                    end iterating a row, add all the elements of a row in list
                    */
                    accountDetails.add(account);
                }
            }

            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accountDetails;
    }

    
}
