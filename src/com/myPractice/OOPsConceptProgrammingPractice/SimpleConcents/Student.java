package com.myPractice.OOPsConceptProgrammingPractice.SimpleConcents;

public class Student {
    String name;
    int age;
    int id;
    String branch;
    int year;

    Student(String n, int a, int id, String b, int y) {
        this.name = n;
        this.age = a;
        this.id = id;
        this.branch = b;
        this.year = y;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getBranch() {
        return branch;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return (this.getName() + "  " + this.getAge() + "  " + this.getId() + "  " + this.getBranch() + "  " + this.getYear());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kuldeep", 27, 10020098, "CSE", 2020);
        Student s2 = new Student("John", 21, 20098, "ME", 2021);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
