package com.myPractice.MyTaskWorkplace;

public class AssignmentTask {

    String name;
    int age;
    int salary;
    char gender;

    AssignmentTask(String n, int a, int s, char g) {
        this.name = n;
        this.age = a;
        this.salary = s;
        this.gender = g;

    }

    @Override
    public String toString() {
        return "AssignmentTask{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}


class John {
    public static void main(String[] args) {
        AssignmentTask p1 = new AssignmentTask("Kuldeep", 24, 85000, 'M');

        System.out.println(p1);
    }
}
