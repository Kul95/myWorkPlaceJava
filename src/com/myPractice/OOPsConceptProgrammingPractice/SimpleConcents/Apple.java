package com.myPractice.OOPsConceptProgrammingPractice.SimpleConcents;

public class Apple {
    String brandName;
    int price;
    String model;

    public Apple(String mac, String firstCopy, int i, int i1) {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
class Test3{
    public static void main(String[] args) {
        Apple a1=new Apple("MAC","FirstCopy",230000,2666);
        System.out.println(a1.toString());
        
    }
}
