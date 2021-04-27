package reviewclass10.abstractclass;

public abstract class DataBase {
    public abstract void readFromDataBase(String databaseName);
    public abstract void writeFromDataBase(String  databaseName);
    public abstract void modifyFromDataBase(String databaseName);
}
class OracleDatabase extends DataBase{
    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("We are the Oracle experts, we have provided the implementation"+"Reading data from OracleDataBased");
    ;
    }
    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("We are the Oracle experts, we have provided the implementation"+"Write data from OracleDataBased");
   ;
    }
    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("We are the Oracle experts, we have provided the implementation"+"Modify data from OracleDataBased");

    }
}

class MicrosoftDataBase extends DataBase{
    public void readFromDataBase(String databaseName) {
        System.out.println("We are the Microsoft experts, we have provided the implementation"+"Reading data from OracleDataBased");
    }
    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("We are the Microsoft experts, we have provided the implementation"+"Write data from OracleDataBased");
    }
    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("We are the Microsoft experts, we have provided the implementation"+"Modify data from OracleDataBased");
    }

}
abstract class IBMDatabase extends DataBase{
    public void readFromDataBase(String databaseName){
        System.out.println("We are the Microsoft experts, we have provided the implementation"+"Reading data from OracleDataBased");
    }
}
