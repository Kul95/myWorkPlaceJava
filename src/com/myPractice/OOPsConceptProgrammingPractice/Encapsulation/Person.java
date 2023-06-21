package com.myPractice.OOPsConceptProgrammingPractice.Encapsulation;

public class Person {
    private String name;
    private int age;
    private String country;
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age=age;
}
public String getCountry(){
    return country;
}
public void setCountry(String country){
    this.country=country;
}
    public static void main(String[] args) {
Person p1=new Person();
p1.setName("Kuldeep Kumar");
p1.setAge(27);
p1.setCountry("India");
        System.out.println("My name is "+p1.getName()+" and my age is "+p1.getAge()+" and I am from "+p1.getCountry());
    }


}
