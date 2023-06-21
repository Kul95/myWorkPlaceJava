package com.myPractice.OOPsConceptProgrammingPractice.SimpleConcents;

public class Animal {
    String name;
    String color;
    int speed;
    String sound;
    int price;

    Animal(String n, String c, int s, String sound, int p) {
        this.name = n;
        this.color = c;
        this.speed = s;
        this.sound = sound;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSound() {
        return sound;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return (this.getName() + "   " + this.getColor() + "  " + this.getSpeed() + "   " + this.getSound() + "  " + this.getPrice());
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Cow", "White", 10, "Heavy", 2000);
        Animal a2 = new Animal("Lion", "Grey", 100, "Roar", 30000);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
