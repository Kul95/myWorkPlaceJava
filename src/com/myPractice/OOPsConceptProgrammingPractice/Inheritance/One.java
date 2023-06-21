package com.myPractice.OOPsConceptProgrammingPractice.Inheritance;

public class One {
    public void print(){
        System.out.println("My One statment...");
    }
}
class Two extends One{
    public  void set(){
        System.out.println("Two set statment..");
    }
}
class Test1{
    public static void main(String[] args) {
        One t2=new One();
        t2.print();
    }
}
