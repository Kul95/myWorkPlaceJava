package com.myPractice.OOPsConceptProgrammingPractice.Inheritance;

public class Employee {
    int salary=2000;
}
class Engineer extends Employee{
    int benifits=100000;
}
class Text{
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1.salary);
    }
}
