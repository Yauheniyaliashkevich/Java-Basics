package reviewClass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.json.JsonOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {
    /*
    Create a property file to store following configurations:
browser=chrome
url=https://facebook.com
username
password
Read file and extract values of browser & url
     */
    public static void main(String[] args) throws IOException {
        String path =System.getProperty("user.dir")+"/Files/Book1.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);
        Sheet sheet = excel.getSheet("Sheet2");
        Row row=sheet.getRow(3);
        Cell cell =row.getCell(1);
        System.out.println(cell);





        /*Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("name"));
*/




    }
}
