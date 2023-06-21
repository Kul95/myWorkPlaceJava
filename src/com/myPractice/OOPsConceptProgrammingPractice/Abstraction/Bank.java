package com.myPractice.OOPsConceptProgrammingPractice.Abstraction;

abstract class Bank {
   Bank(){
       System.out.println("Bank class constructor....");
   }
   abstract void fullTime();
}
class HDFC extends Bank{
    HDFC(){
        System.out.println("HDFC class Constructor..");
    }
    void fullTime(){
        System.out.println("Full time employee...");
    }
}
class Test{

    public static void main(String[] args) {
        Bank b1=new HDFC();
        b1.fullTime();
    }}
