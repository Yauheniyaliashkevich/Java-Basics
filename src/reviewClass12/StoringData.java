package reviewClass12;

import com.class29.ArrayListDemo;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoringData {
    public static void main(String[] args) throws IOException {
        String path =System.getProperty("user.dir")+"/Files/Book1.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excel.getSheet("Sheet2");
        int physicalNumberOfRows =sheet.getPhysicalNumberOfRows();

        List<Person> list=new ArrayList<>();
        for (int i = 1; i < physicalNumberOfRows; i++) {
            Row row= sheet.getRow(i);
            //int physicalNumberOfCells=row.getPhysicalNumberOfCells();
            Person person=new Person();
            //System.out.print(row.getCell(0)+" ");
            person.setFirstName(row.getCell(0).toString());
            person.setLastName(row.getCell(1).toString());
            //person.setAge((int)Double.parseDouble(row.getCell(2).toString())); //one way
            person.setAge((int)row.getCell(2).getNumericCellValue());  //another way
            list.add(person);
        }
        System.out.println(list);
    }
}
