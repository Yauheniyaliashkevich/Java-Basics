package com.class33.WorkingWithFiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String path ="/Users/yauheniyaliashkevich/Documents/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        /*Row row2=sheet.getRow(2);
        Cell cell = row2.getCell(0);*/
        Map<String,String> rows = new HashMap<>();

        int noOfRowsInASheet = sheet.getPhysicalNumberOfRows();
        System.out.println("Size of rows: "+noOfRowsInASheet);
        for (int i = 1; i < noOfRowsInASheet; i++) {
            Row row = sheet.getRow(i);
            int noOfCellsInASheet = row.getPhysicalNumberOfCells();


            //System.out.println(noOfCellsInASheet);
            for (int j = 0; j < noOfCellsInASheet; j++) {
                //System.out.print(row.getCell(j)+" ");
                String key=sheet.getRow(0).getCell(j).toString();
                String value = row.getCell(j).toString();
                System.out.print(key+" "+value+" ");

                //rows.put(sheet.getRow(0).getCell(j).toString(),row.getCell(j).toString());
            }
            System.out.println();
        }
        //System.out.println(rows);







    }
}
