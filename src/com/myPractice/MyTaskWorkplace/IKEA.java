package com.myPractice.MyTaskWorkplace;

interface IKEA {
    public void sail();
}
class Chair implements IKEA{
    String name;
    String color;

    public Chair(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void sail() {
        System.out.println("This is interface ..");
    }
}
class Test3{
    public static void main(String[] args) {
        IKEA obj=new Chair("Sofa","Green");
        System.out.println(obj);
        obj.sail();
    }
}
