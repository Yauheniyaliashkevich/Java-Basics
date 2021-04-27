package com.class27;

public  abstract class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while
     open is an abstract. Create 3 subclasses: JavaFile, WordFile,
      PdfFile that will provide specific implementation of open behaviour:
       Example: to open .java file we need notepad++ or sublime text, to open .
       doc file we need Microsoft word to be installed etc
     */

    abstract void open();
    void edit(){
        System.out.println("To edit files we need something");
    }
    void close(){
        System.out.println("To close files we need to click red button");
    }

}

class JavaFile extends File {
    void open(){
        System.out.println("To open java file we need notepad++");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("To open word file we need Microsoft word");
    }
}
class PdfFile extends File{
    void open(){
        System.out.println("To open Pdf file we need something");
    }
}
class FileTester {
    public static void main(String[] args) {
        File f1=new JavaFile();
        f1.open();
        f1.edit();
        f1.close();
        File f2=new WordFile();
        f2.open();
        f2.edit();
        f2.close();
        File f3=new PdfFile();
        f3.open();
        f3.edit();
        f3.close();
    }
}