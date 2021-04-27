package reviewClass8;

public class Employee {
    private String name;
    private String empID;
    private String grade;
    private String department;
    public void method1(){
        System.out.println("Important code from method1");
    }
    public Employee(String name,String empID,String grade,String department){
       /* this.name=name;
        this.empID=empID;
        this.grade=grade;*/
        this(name, empID, grade);
        this.department=department;
        //method1(); or
        this.  method1();
    }
    public Employee(String name,String empID,String grade){
        /*this.name=name;
        this.empID=empID;*/
        this(name, empID);
        this.grade=grade;
    }
    public Employee(String name,String empID){
        /*this.name=name;*/
        this(name);
        this.empID=empID;
    }
    public Employee(String name){
        this();
        this.name=name;
    }
    public Employee(){
        toString();
        System.out.println("Important line of code must be executed whenever an object of this is created");
        System.out.println("Important line of code must be executed whenever an object of this is created");
        System.out.println("Important line of code must be executed whenever an object of this is created");
        System.out.println("Important line of code must be executed whenever an object of this is created");
        System.out.println("Important line of code must be executed whenever an object of this is created");
        System.out.println("Important line of code must be executed whenever an object of this is created");
    }


    public static void main(String[] args) {
        Employee employee=new Employee("Katya", "123f", "M4","IT");
        Employee employee1=new Employee();
    }
}
