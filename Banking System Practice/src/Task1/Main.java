package Task1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account one =new Account("Ikhlas",123,500);
        Account two =new Account("Atiq",1234,500);
        Bank hbl=new Bank();
        hbl.addaccount(one);
        hbl.addaccount(two);
        //hbl.deposit(123, 100);
        //hbl.deposit(1234, 500);
        //hbl.transfer(123, 1234, 200);
    }
}
