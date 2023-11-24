/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bankaccount acc1=new bankaccount("ikhlas",1000);
        System.out.println(acc1.withdraw(500));
        System.out.println(acc1.getbalance());
        System.out.println(acc1.getaccountnumber());
        
        checkingaccount acc2=new checkingaccount("dave",20);
        
        System.out.println(acc2.withdraw(5));
        System.out.println(acc2.getbalance());
        System.out.println(acc2.getaccountnumber());
        
        
        savingsaccount acc3=new savingsaccount("theo",100);
        System.out.println(acc3.getaccountnumber());
        
        savingsaccount acc4=new savingsaccount("waiter",2500);
        System.out.println(acc4.getaccountnumber());
        System.out.println(acc4.getbalance());
        acc4.postInterest();
        System.out.println(acc4.getbalance());

        savingsaccount acc5=new savingsaccount("ibad",500);
        System.out.println(acc5.getaccountnumber());
        System.out.println(acc5.getbalance());
        System.out.println(acc5.getowner());
        
                
        
        
        
        
       
        
        
    }
    
}
