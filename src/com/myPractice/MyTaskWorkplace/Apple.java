package com.myPractice.MyTaskWorkplace;

public class Apple {
    String name;
    int price;
    String color;

    Apple(String n, int p, String c) {
        this.name = n;
        this.price = p;
        this.color = c;
    }

    public Apple() {
        System.out.println("Apple constructor .....!");
    }


    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

class MacBook extends Apple {
    String name;
    int price;
    String color;

    MacBook(String n, int p, String c) {
        super();

        this.name = n;
        this.price = p;
        this.color = c;

    }

    @Override
    public String toString() {
        return "MacBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

class Test4 {
    public static void main(String[] args) {
        Apple a1 = new Apple("MAckBookPro", 234000, "Grey");
        System.out.println("####################################################");
        System.out.println(a1);
        System.out.println("********************************************************");
        MacBook mb=new MacBook("Mcb",58000,"green");
        System.out.println(mb);
    }
}

