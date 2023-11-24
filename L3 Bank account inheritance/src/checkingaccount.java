/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class checkingaccount extends bankaccount { //child class
    
    public double fee=15; //15 cents
    
   
    
    checkingaccount(String name, double amount){
        super(name,amount);
        super.setcheckaccount();
    
    }
    
    public boolean withdraw(double amount){
        this.fee=fee+amount;
        return super.withdraw(fee);
        
    }
    
    
    
    
}
