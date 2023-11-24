/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class savingsaccount extends bankaccount {
    public double rate=2.5; //2.5% rate annual
    public static int savingsnumber=0;
    private  String accountnum; //private would hide this from super or parent class
    
    
    savingsaccount(){
        
    }
    
    
    savingsaccount(String name, double amount){
        super(name,amount);
        this.accountnum=super.getaccountnumber()+"-"+String.valueOf(savingsnumber++);
    }
    
    public void postInterest(){
        
        double interest=( super.getbalance()*(rate/100) )/12+super.getbalance();
        
        super.setbalance(interest);
    }
    
    public String getaccountnumber() {
        return this.accountnum;
    }

    
    
}
