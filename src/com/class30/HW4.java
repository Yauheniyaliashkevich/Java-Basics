package com.class30;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashSet;
import java.util.Set;

public class HW4 {
    /*
    Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
      Each student object should have name and studentID.
      Display name of each student.
     */
    public static void main(String[] args) {
        /*StudentHW4 student1=new StudentHW4("Jane", "123vbn");
        StudentHW4 student2= new StudentHW4("Vlad","456fgj");
        StudentHW4 student3= new StudentHW4("Vova","543ghj");
        StudentHW4 student4= new StudentHW4("Inna","678vdd");
        StudentHW4 student5= new StudentHW4("Dasha","234vbm");
        StudentHW4 student6= new StudentHW4("Masha","987bvv");
        Set<StudentHW4> studentObj = new HashSet<StudentHW4>();
        studentObj.add(student1);
        studentObj.add(student2);
        studentObj.add(student3);
        studentObj.add(student4);
        studentObj.add(student5);
        studentObj.add(student6);
*/
        Set<StudentHW4> studentObj= new HashSet<>();
        studentObj.add(new StudentHW4("Jane","123dfg"));
        studentObj.add(new StudentHW4("Vlad","456fhh"));
        studentObj.add(new StudentHW4("Vova","567dfg"));
        studentObj.add(new StudentHW4("Inna","234gbf"));
        studentObj.add(new StudentHW4("Dasha","765vbn"));
        studentObj.add(new StudentHW4("Masha","456bvb"));

        System.out.println(studentObj);

        /*for (StudentHW4 obj:studentObj
             ) {
            obj.display();
        }*/


    }
}
class StudentHW4 extends HW4{
    String name;
    String ID;

    public StudentHW4(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "StudentHW4{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
     /*public void display(){
        System.out.println("Student "+name+" has ID number: "+com.sun.xml.internal.bind.v2.model.core.ID);
    }*/
}

