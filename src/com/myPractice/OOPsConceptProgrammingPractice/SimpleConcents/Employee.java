package com.myPractice.OOPsConceptProgrammingPractice.SimpleConcents;
public class Employee {
    String name;
    int id;
    char gender;
    String address;
    int dob;
    int doj;
    String department;

    Employee(String name, int id, char gen, String address, int dob, int doj, String department) {
        this.name = name;
        this.id = id;
        this.gender = gen;
        this.address = address;
        this.dob = dob;
        this.doj = doj;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getDob() {
        return dob;
    }

    public int getDoj() {
        return doj;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return (this.getName() + "   " + this.getId() + "   " + this.getGender() + "  " + this.getAddress() + "    " + this.getDob() + "   " + this.getDoj() + this.getDepartment());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John Smith", 1, 'M', "Udhog Vihar Gurgaon", 2002, 2015, "Coal India PVT LTD");
        Employee e2 = new Employee("Henry Brooks", 2, 'M', " Cyber Hub Gurgaon", 2012, 2085, "NTPC LTd");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
