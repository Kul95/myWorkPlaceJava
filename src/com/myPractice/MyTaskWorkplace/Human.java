package com.myPractice.MyTaskWorkplace;

interface Human {
public void eat();
}
class Student implements Human{
    String name;
    int age;
    String gender;

     Student(String n, int a, String g) {
         this.name=n;
         this.age=a;
         this.gender=g;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("hello");
    }
}
class Employee implements Human{
    String name;
    int age;
    String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

   @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("hi");
    }
}
class Test1{
     public static void main(String[] args) {
        Human h1=new Student("Aman",36,"Male");
        System.out.println(h1);
        h1.eat();

        System.out.println("-----------------------------------------------");
        Human h2=new Employee("Nita",56,"Fimale");
        System.out.println(h2);
        h2.eat();
    }
}
