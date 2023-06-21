package com.myPractice.MyTaskWorkplace;

public class Car {
    private String name;
    private int milage;
    private String typeFule;

    public Car(String name, int milage, String typeFule) {
        this.name = name;
        this.milage = milage;
        this.typeFule = typeFule;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", milage=" + milage +
                ", typeFule='" + typeFule + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public String getTypeFule() {
        return typeFule;
    }

    public void setTypeFule(String typeFule) {
        this.typeFule = typeFule;
    }

}
class Test{
    public static void main(String[] args) {
        Car car1=new Car("Audi",10,"Petrol");
        Car car2=new Car("BMW",7,"Petrol");
        System.out.println(car1);
        System.out.println(car2);
    }
}
