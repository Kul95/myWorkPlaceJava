package com.myPractice.OOPsConceptProgrammingPractice.Inheritance;

public class Multiple {
    public void Test1(){
        System.out.println("First method");
    }
}
class Second extends Multiple{
    public void Test2(){
        System.out.println("Second method....");
    }
}
class Three extends  Second{
    public void Test3(){
        System.out.println("Third Method....");
    }
}
class Main{
    public static void main(String[] args) {
        Multiple m1=new Three();
        m1.Test1();
        Three t1=new Three();
        t1.Test1();
        t1.Test2();
        t1.Test3();

    }
}
