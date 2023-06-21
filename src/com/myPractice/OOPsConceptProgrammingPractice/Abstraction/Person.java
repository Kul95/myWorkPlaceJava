package com.myPractice.OOPsConceptProgrammingPractice.Abstraction;

abstract class Person {
    abstract void printInfo();
}
class Student extends  Person{
    void printInfo(){
        String name="Kuldeep";
        int age=11;
        float salary=8500;
        System.out.println(name+"  "+age+"  "+salary);
    }
}
class Employee extends Person{
    void printInfo(){
        String name="John";
        int age=29;
        int salary=30000;
        System.out.println(name+"   "+age+"  "+salary);
    }
}
class Base{
    public static void main(String[] args) {
Person p1=new Student();
Person p2=new Employee();
p1.printInfo();
p2.printInfo();
    }
}
