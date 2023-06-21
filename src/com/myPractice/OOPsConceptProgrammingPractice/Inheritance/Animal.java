package com.myPractice.OOPsConceptProgrammingPractice.Inheritance;

public class Animal {
    public void eat(){
        System.out.println("Animal is eating ....");
    }
    public void run(){
        System.out.println("Animal is running");
    }
}
class Lion extends Animal{
    public void speak(){
        System.out.println("Lion is speaking...");
    }

    public static void main(String[] args) {
        Animal a1=new Lion();
        a1.eat();
    }
}

