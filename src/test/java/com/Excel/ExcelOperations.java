package com.Excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelOperations {

    public static String readStringData(String sheet,int rowno,int cellno) {
        try {
            File f = new File("F:\\Praneeth\\Resource\\Login.xlsx");
            FileInputStream fis = new FileInputStream(f);
            Workbook login= WorkbookFactory.create(fis);
            String  data = login.getSheet(sheet).getRow(rowno).getCell(cellno).getStringCellValue();
            return data; //"1234"
        }
        catch(Exception rv){
            return "";
        }

    }
    public static void writeData(String sheet,int rowno,int cellno,String data) {
        try {
            File f = new File("F:\\Praneeth\\Resource\\Login.xlsx");
            FileInputStream fis = new FileInputStream(f);
            Workbook login= WorkbookFactory.create(fis);
            login.getSheet(sheet).createRow(rowno).createCell(cellno).setCellValue(data);
            FileOutputStream fos = new FileOutputStream(f);
            login.write(fos);
        }
        catch(Exception rv){}

    }
    public static long readLongNumericData(String sheet,int rowno,int cellno) {
        try {
            File f = new File("F:\\Praneeth\\Resource\\Login.xlsx");
            FileInputStream fis = new FileInputStream(f);
            Workbook login= WorkbookFactory.create(fis);
           long  data =(long) login.getSheet(sheet).getRow(rowno).getCell(cellno).getNumericCellValue();
            return data;
        }
        catch(Exception rv){
            return 0;
        }

    }
    public static int readIntNumericData(String sheet,int rowno,int cellno) {
        try {
            File f = new File("F:\\Praneeth\\Resource\\Login.xlsx");
            FileInputStream fis = new FileInputStream(f);
            Workbook login= WorkbookFactory.create(fis);
            int  data =(int) login.getSheet(sheet).getRow(rowno).getCell(cellno).getNumericCellValue();
            return data;
        }
        catch(Exception rv){
            return 0;
        }

    }
    public static double readDblIntNumericData(String sheet,int rowno,int cellno) {
        try {
            File f = new File("F:\\Praneeth\\Resource\\Login.xlsx");
            FileInputStream fis = new FileInputStream(f);
            Workbook login= WorkbookFactory.create(fis);
            double data = login.getSheet(sheet).getRow(rowno).getCell(cellno).getNumericCellValue();
            return data;
        }
        catch(Exception rv){
            return 0;
        }

    }
}
