package com.myPractice.OOPsConceptProgrammingPractice.GenericConcepts;

public class GenericStudent {
    public static void main(String[] args) {
        GenericStudentDemo<String,Integer,Integer,String,Integer> s1=new GenericStudentDemo<String, Integer, Integer, String, Integer>("Joya Akhtar",50,209,"CSE",20980000) ;
        GenericStudentDemo<String,Integer,Integer,String,Integer> s2=new GenericStudentDemo<String, Integer, Integer, String, Integer>(" Virat Kohali",40,18,"CRICKET",200000) ;
        System.out.println(s1.toString());
        System.out.println("----------------------------------------------------------");
        System.out.println(s2.toString());
    }
}
class GenericStudentDemo<name,age,id,branch,salary>{
    private final  name name;
    private final age age;
    private final id id;
    private final branch branch;
    private final salary salary;
    GenericStudentDemo(name name,age age,id id,branch branch,salary salary){
        this.name=name;
        this.age=age;
        this.id=id;
        this.branch=branch;
        this.salary=salary;
    }
    public name getName(){
        return name;
    }
    public age getAge(){
        return age;
    }
    public id getId(){
        return id;
    }
    public branch getBranch(){
        return branch;
    }
    public salary getSalary(){
        return salary;
    }
    public String toString(){
        return (this.getName()+"   "+this.getAge()+"  "+this.getId()+"  "+this.getBranch()+"   "+this.getSalary() );
    }

}
