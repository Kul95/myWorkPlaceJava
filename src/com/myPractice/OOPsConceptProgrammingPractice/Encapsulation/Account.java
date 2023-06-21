package com.myPractice.OOPsConceptProgrammingPractice.Encapsulation;

public class Account {
    private double account;
    private String name;
    private float amount;
    public double getAccount(){
        return account;
    }
    public String getName(){
        return name;
    }
   public float getAmount(){
        return amount;
   }
   public void setAccount(double account){
        this.account=account;
   }
   public void setName(String name){
        this.name=name;
   }
   public void setAmount(float amount){
        this.amount=amount;
   }
}
 class Test{
     public static void main(String[] args) {
         Account a1=new Account();
         a1.setAccount(9876542);
         a1.setName("Bank of Baroda");
         a1.setAmount(987888);
         System.out.println("My Account is :"+a1.getAccount()+" my bank name is "+a1.getName()+" and my amount is "+a1.getAmount());
     }
}
