package com.myPractice.OOPsConceptProgrammingPractice.Encapsulation;

public class Area {
    int length;
    int breath;
    Area(int length,int breath){
        this.length=length;
        this.breath=breath;
    }
    public void getArea(){
        int area=length*breath;
        System.out.println("My area is :"+area);
    }
}
class Main{
    public static void main(String[] args) {
        Area a1=new Area(2,16);
        a1.getArea();
    }
}

