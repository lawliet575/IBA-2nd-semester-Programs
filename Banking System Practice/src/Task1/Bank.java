package Task1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Bank {
     ArrayList<Account> Accounts=new ArrayList<>();
    // private static Bank bank;
    java.io.File file;
    

    public Bank() throws FileNotFoundException{
      file=new java.io.File("src\\Task1\\accounts.txt");
      
    }


    public void updatetxtfile() throws FileNotFoundException{
       if(Accounts.isEmpty()){
        return;
       }
        PrintWriter writer=new PrintWriter(file);
        for (int i = 0; i < Accounts.size(); i++) {
            String temp=Accounts.get(i).toString();
            writer.println(temp);
        }
        writer.close();
    }

    public void deposit(int accountnum,double amount) throws FileNotFoundException{
        int x=-1;
        for (int i = 0; i < Accounts.size(); i++) {
            if(Accounts.get(i).getAccount_num()==accountnum){
                x=i;
            }
        }

        if(x==-1){
          System.out.println("Invalid account num");
          return;
        }
        else{
          Accounts.get(x).updatebalance(amount);
          System.out.println("Deposit Successful");
          System.out.println("Here is updated account");
          System.out.println(Accounts.get(x));
          System.out.println();
          updatetxtfile();
        }
    }

    public double withdraw(int accountnum,double withdraw_amount) throws FileNotFoundException{
        int x=-1;
        for (int i = 0; i < Accounts.size(); i++) {
            if(Accounts.get(i).getAccount_num()==accountnum){
                x=i;
            }
        }

        if(x==-1){
          System.out.println("Account not found");
          return -1;
        }
        
          double temp=Accounts.get(x).getBalance();
          if(withdraw_amount>temp){
            return -1;
          }
          Accounts.get(x).updatebalance(temp-withdraw_amount);
          updatetxtfile();
          return (temp-withdraw_amount);

    }
    
    

    public void addaccount(Account acc) throws FileNotFoundException {
        Accounts.add(acc);
        updatetxtfile();
    }

    public void displayallaccounts(){
        System.out.println("ALL ACCOUNTS IN BANK");
        for (int i = 0; i < Accounts.size(); i++) {
            System.out.println(Accounts.get(i));
            System.out.println();
            
        }
    }


    public void transfer(int senderaccount,int recieveraccount,double amount) throws FileNotFoundException{
        int sender_index=-1;
        int reciever_index=-1;

        for(int i=0;i<Accounts.size();i++){
            if(Accounts.get(i).getAccount_num()==senderaccount){
                sender_index=i;
            }

            else if(Accounts.get(i).getAccount_num()==reciever_index){
                reciever_index=i;
            }
        }

        if(sender_index==-1 || reciever_index==-1){
            return;
        }

        double senderamount=this.withdraw(Accounts.get(sender_index).getAccount_num(), amount);
        this.deposit(Accounts.get(reciever_index).getAccount_num(), senderamount);
        updatetxtfile();
        System.out.println("TRANSFER SUCCESSFUL");


        

    } 




    
}
