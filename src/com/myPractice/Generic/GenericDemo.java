package com.myPractice.Generic;

public class GenericDemo {
    public static void main(String[] args) {
        GenericStudent<String,Integer,String,Integer> gs=new GenericStudent<>("Charls",27,"Psylogy",12);
        System.out.println(gs);

    }
}
class GenericStudent<Name,Age,Subject,RollNo>{
    public String name;
    public int age;
    public String subject;
    public int rollNo;
    GenericStudent(Name name,Age age,Subject subject,RollNo rollNo){
        this.name= (String) name;
        this.age= (int) age;
        this.subject= (String) subject;
        this.rollNo= (int) rollNo;

    }

    @Override
    public String toString() {
        return "GenericStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
