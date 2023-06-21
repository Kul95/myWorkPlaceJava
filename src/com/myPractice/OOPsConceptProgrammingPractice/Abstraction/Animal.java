package com.myPractice.OOPsConceptProgrammingPractice.Abstraction;

public class Animal {
    Animal() {
        System.out.println("This is animal class base..");
    }

    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Elephant extends Animal{

}
class Main{
    public static void main(String[] args) {
    Animal a1=new Animal();
    a1.eat();
}
}

