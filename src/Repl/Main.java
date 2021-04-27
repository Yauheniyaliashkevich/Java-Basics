package Repl;

public class Main {
    public static void main(String [] args){

        SyntaxTechnologies obj=new SyntaxTechnologies();
        obj.display();

        SyntaxTechnologies obj1=new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        obj1.display();
    }
}
class SyntaxTechnologies{
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){
    }

    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}

