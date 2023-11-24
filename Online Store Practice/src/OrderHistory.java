import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OrderHistory { //applysingleton here
    private static OrderHistory OrderHistory;
    static ArrayList<Order> allorders=new ArrayList<>();
   // Order order;
    java.io.File file;

    private OrderHistory(Order order) {
        //this.order = order;
        allorders.add(order);
        file=new java.io.File("Order History.txt");

    }

    public static OrderHistory getinstance(Order order){
        if(OrderHistory==null){
            return new OrderHistory(order);
        }
        return OrderHistory;

    }

    public void write_order_in_file() throws IOException{
       // java.io.File file=new java.io.File("Order History.txt");
        //PrintWriter writer=new PrintWriter(new FileWriter(file,true));
        PrintWriter writer=new PrintWriter(file);

        //String temp=order.toString();
        for (int i = 0; i < allorders.size(); i++) {
            String temp=allorders.get(i).toString();
            writer.println(temp);
        }
        writer.close();
    }

    
    
}
