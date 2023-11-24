package Task1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account extends Bank{
    private String Name;
    private int account_num;
    private double balance;


    public Account(String name, int account_num, double balance) throws FileNotFoundException{
        this.Name = name;
        this.account_num = account_num;
        this.balance = balance;
    }

    public Account() throws FileNotFoundException{
        System.out.println("Opening new account");
        Scanner input=new Scanner(System.in);
        System.out.println("Input name");
        this.Name=input.next();
        System.out.println("Enter account number");
        this.account_num=input.nextInt();
        System.out.println("Enter balance");
        this.balance=input.nextDouble();
        input.close();
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public int getAccount_num() {
        return account_num;
    }


    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }


    public double getBalance() {
        return balance;
    }


    public void updatebalance(double balance) {
        this.balance = this.balance+balance;
    }

    public void withdraw(double amount) throws FileNotFoundException{
        super.withdraw(getAccount_num(), amount);
    }

    public void deposit(double amount) throws FileNotFoundException{
        super.deposit(this.account_num, amount);

    }



    public String toString(){
        return "Name:" +getName()+"\n"+
               "Account number: "+getAccount_num()+"\n"+
               "Balance: "+getBalance();        
    }

    
    
}
