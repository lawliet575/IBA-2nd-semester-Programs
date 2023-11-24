/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class bankaccount { //parent class
    
    public double balance;
    public String owner;
    private static String accountnum;
    public static  int numofacc= 100001;
    
     bankaccount(){ //no arguement constructor
         this.balance=0;
         this.accountnum=String.valueOf(numofacc)+"";
         numofacc++;
    }
     
     bankaccount(String name, double amount){
         this.owner=name;
         this.balance=amount;
         this.accountnum=String.valueOf(numofacc)+"";
         numofacc++;
     }
     
     public void setcheckaccount(){ //setter
        this.accountnum=accountnum+"-10";
     }
     
     bankaccount(bankaccount old, double amount){ 
         this.owner=old.owner;
         this.accountnum=old.accountnum;
         this.balance=amount;
     }
     
     public boolean withdraw(double amount){
         if(this.balance>=amount){
             double a=this.balance-amount;
             this.balance=a;
             return true;
         }
         
         else return false;
         
     }
     
     public double getbalance(){
         return this.balance;
     }
     
     public String getowner(){
         return this.owner;
     }
     
     public String getaccountnumber(){
         return this.accountnum;
     }
     
     public void setbalance(double amount){//deposit hah found u
         this.balance=amount;
     }
     
     public void setaccountnumber(String newaccountnum){
         this.accountnum=newaccountnum;
     }
    
    
}
