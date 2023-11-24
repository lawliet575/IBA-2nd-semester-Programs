import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Customerloyalty {
    java.io.File file1;
    java.io.File file2;

    ArrayList<String> loyals=new ArrayList<>();
    ArrayList<String> good=new ArrayList<>();
    ArrayList<String> casual=new ArrayList<>();




     Customerloyalty(){
        file1=new java.io.File("Order History.txt");
        file2=new java.io.File("CustomerLoyalty.txt");

    }

   public void read_order_history(){
     Scanner reader;
    try {
        reader=new Scanner(file1);
    } catch (FileNotFoundException e) {
        System.out.println("File not found");
        return;
     }

     while (reader.hasNext()){
        //reader.useDelimiter("");
        String orderid=reader.next();
        String customerid=reader.next();
        String totalamount=reader.next();
        double tempamount=Double.parseDouble(totalamount);
        if(tempamount>30000){
            String temp=customerid+" "+totalamount;
            loyals.add(temp);
        }
        if(tempamount>10000 && tempamount<30000){
            String temp=customerid+" "+totalamount;
            good.add(temp);
        }
        else{
            String temp=customerid+" "+totalamount;
            casual.add(temp);
        }

    }

    reader.close();

   }


   public void writetofile() throws FileNotFoundException{
      PrintWriter writer=new PrintWriter(file2);
      for (int i = 0; i < loyals.size(); i++) {
        writer.print(loyals.get(i)+" ");
        writer.println("LOYAL");
      }

      for (int i = 0; i < good.size(); i++) {
        writer.print(good.get(i)+" ");
        writer.println("Good");
      }

      for (int i = 0; i < casual.size(); i++) {
        writer.print(casual.get(i)+" ");
        writer.println("Casual");
      }

   writer.close();
   }
    
}
