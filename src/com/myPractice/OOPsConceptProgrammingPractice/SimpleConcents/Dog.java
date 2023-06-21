package com.myPractice.OOPsConceptProgrammingPractice.SimpleConcents;

public class Dog {
    String name;
    String bread;
    int age;
    String color;

    Dog(String name, String bread, int age, String color) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return (this.getName() + " and " + this.getBread() + " and " + this.getBread() + " and " + this.getBread());
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Touchy", "Papilla", 23, "black");
        Dog d2 = new Dog("Pile", "Indian", 16, "Red");
        System.out.println(d1.toString());
        System.out.println(d1.toString());
    }
}
