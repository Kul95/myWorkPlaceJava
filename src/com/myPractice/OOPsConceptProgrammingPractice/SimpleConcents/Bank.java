package com.myPractice.OOPsConceptProgrammingPractice.SimpleConcents;

public class Bank {
    String name;
    int ifscCode;
    String address;
    String branch;
    String account;
    int amount;
    Bank(String name,int code,String address,String branch,String account,int amount){
        this.name=name;
        this.ifscCode=code;
        this.address=address;
        this.branch=branch;
        this.account=account;
        this.amount=amount;
    }
    public String getName(){
        return name;
    }
    public int getIfscCode(){
        return ifscCode;
    }
    public String getAddress(){
        return address;
    }
    public String getBranch(){
        return branch;
    }
    public String getAccount(){
        return account;
    }
    public int getAmount(){
        return amount;
    }
    public String toString(){
        return (this.getName()+"   "+this.getIfscCode()+"    "+this.getAddress()+"    "+this.getBranch()+"    "+this.getAccount()+"    "+this.getAmount());
    }
    public static void main(String[] args) {
        Bank bank1=new Bank("HDFC",120098,"IMT Maneswar","Gurgoan","Saving Account",250000);

        Bank bank2=new Bank("ICIC",8976,"NSP Delhi","Delhi","Current Account",20000);
        System.out.println(bank1.toString());
        System.out.println("------------------------------------------------------------------------------------------------------>");
        System.out.println(bank2.toString());

    }
}
