package com.myPractice.OOPsConceptProgrammingPractice.Inheritance;
public class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBreak(int decrement){
        speed=speed-decrement;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
    public String toString(){
        return (gear+ "  "+speed);
    }
}
class MountainBicycle extends Bicycle{
    public int seatHeight;

    public MountainBicycle(int gear, int speed,int startHeight) {
        super(gear, speed);
        seatHeight=startHeight;
    }
    @Override
    public String toString(){
        return (super.toString()+" "+seatHeight);
    }
}
class Test{
    public static void main(String[] args) {
        MountainBicycle mb=new MountainBicycle(3,100,25);
        System.out.println(mb.toString());
    }
}
