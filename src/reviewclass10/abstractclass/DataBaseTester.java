package reviewclass10.abstractclass;

import reviewclass10.abstractclass.DataBase;
import reviewclass10.abstractclass.MicrosoftDataBase;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MicrosoftDataBase();
        dataBase.readFromDataBase("Database1");
        dataBase.writeFromDataBase("Database1");
        dataBase.modifyFromDataBase("Database1");
        //DataBase dataBase1=new DataBase("DataBace");
    }
}
