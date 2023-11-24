import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    String id;
    Customer customer;

    double total_amount;
    ArrayList<Product> items=new ArrayList<>();

    Order(String id,Customer customer){
        this.id=id;
        this.customer=customer;
        total_amount=0;

    }

    public void Update_TotalAmount(){
        if(items.isEmpty()){
            return ;
        }
     for (int i = 0; i < items.size(); i++) {
        Product temp=items.get(i);
        double price=temp.getPrice();
        total_amount+=price;
     }

    }

    public void add_to_cart(Product product){
        items.add(product);
        Update_TotalAmount();
    }

    public void removefromcart(){
        int index=0;
    displaycart();
    Scanner input=new Scanner(System.in);
    do {
       System.out.println("Enter index to remove item from cart");
     index=input.nextInt(); 
    } while (index<0 || index>=items.size());

    items.remove(index);
    System.out.println("Product successfully removed");
    System.out.println("Heres your updated cart");
    Update_TotalAmount();
    displaycart();
    
    


    }

    public void displaycart(){
        System.out.println("YOUR UPDATED CART");
        int x=0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println("At index "+x++);
            System.out.println(items.get(i));
            System.out.println();
        }

        System.out.println("Total amount "+ total_amount+" Dollars");
    }


    
    public String getorderId() {
        return id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public String toString(){
        return getorderId()+" "+ customer.getId()+" "+ String.valueOf(getTotal_amount());
    }
}
