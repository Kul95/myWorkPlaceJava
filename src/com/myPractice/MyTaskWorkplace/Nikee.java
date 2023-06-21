package com.myPractice.MyTaskWorkplace;

interface  Nikee {
void shell();
}
class Shose implements Nikee{
    String name;
    int price;
    String brand;
    String color;

    public Shose(String name, int price, String brand, String color) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shose{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void shell() {
        System.out.println("I am selling my Shose.");
    }
}
class Tsirt implements Nikee{
    String name;
    int price;
    String brand;
    String color;

    public Tsirt(String n, int p, String b, String c) {
       this.name=n;
       this.price=p;
       this.brand=b;
       this.color=c;
    }

    @Override
    public String toString() {
        return "Tsirt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void shell() {
        System.out.println("I am selling my T-shirt");
    }
}
class Test2{
    public static void main(String[] args) {
        Nikee n1=new Shose("Nikee",40000,"first","Color");
        System.out.println(n1);
        System.out.println("------------------------------------------------------------------");
        Nikee n2=new Tsirt("Tsirt",2000,"Second","Red");
        System.out.println(n2);
    }
}
