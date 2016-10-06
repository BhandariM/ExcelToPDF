/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenlocalrepositorydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author S525703
 */
public class POIDriver {
    
    
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException    {
        //Create POI file system object.
        POIFSFileSystem objPOIFileSystem = new POIFSFileSystem(new FileInputStream("SampleExcel.xls"));

        //Create a data extractor using file system object.
        ExcelExtractor datExtractor = new ExcelExtractor(objPOIFileSystem);

        //Extract data using extractor and print
        System.out.println(datExtractor.getText());

    
}
}