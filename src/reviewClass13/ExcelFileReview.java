package reviewClass13;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileReview {
    public static void main(String[] args) throws IOException {

        String path ="/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //Sheet sheet=xssfWorkbook.getSheet("Sheet1");











    }
}
