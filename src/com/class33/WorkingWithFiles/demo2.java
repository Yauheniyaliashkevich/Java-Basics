package com.class33.WorkingWithFiles;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class demo2 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/yauheniyaliashkevich/Documents/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");


        int noOfRowsInASheet = sheet.getPhysicalNumberOfRows();
        Map<String, String> map;

        for (int i = 1; i < noOfRowsInASheet; i++) {
            Row row = sheet.getRow(i);
            int noOfCellsInASheet = row.getPhysicalNumberOfCells();
            map = new HashMap<>();


            for (int j = 0; j < noOfCellsInASheet; j++) {

                String key = sheet.getRow(0).getCell(j).toString();
                String value = row.getCell(j).toString();
                System.out.print(key + " " + value + " ");
                map.put(key, value);
                 }
            System.out.println();
        }




    }
}
