package com.myPractice.MyTaskWorkplace;

interface Nike {
    void shell();
}

class Shoes<Price, type, color> implements Nike {
    int price;
    String type;
    String color;

    Shoes(int price, String type, String color) {
        this.price = price;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void shell() {
        System.out.println("Shelling all the products..");
    }
}

class Cloths<Size, color, price> implements Nike {
    String size;
    String color;
    int price;

    Cloths(String size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cloths{" +
                "size='" + size + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public void shell() {
        System.out.println("Selling only t-shirts");
    }
}

class Test5 {
    public static void main(String[] args) {
        Shoes<Integer, String, String> s1 = new Shoes<Integer, String, String>(3000, "Long size", "White");
        System.out.println(s1);
        s1.shell();
        System.out.println("--------------------------------------------------");
        Nike s2 = new Shoes<Integer, String, String>(3500, "Medium", "Black");
        System.out.println(s2);
        System.out.println("---------------------------------------------------");
        Nike cloth1 = new Cloths<String, String, Integer>("Medium", "Yellow", 2000);
        System.out.println(cloth1);
        System.out.println("---------------------------------------------------");
        Nike cloth2 = new Cloths<String, String, Integer>("Large", "Black", 1000);
        System.out.println(cloth2);
        cloth2.shell();
    }
}
