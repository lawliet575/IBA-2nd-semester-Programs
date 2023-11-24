import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Product one=new Product("1234", "Lays", "Chips", 50000, 5);
        Product two=new Product("567", "DairyMilk", "Chocolate", 20000, 20);

        Store naheed=new Store();
        naheed.addProducttoStore(one);
        naheed.addProducttoStore(two);
        //naheed.display_product_with_qt_lessthan10();
        //naheed.simply_display_ALLPRODUCTS();
        //naheed.display_productdetials_fromfile();
        //naheed.deleteproduct();
        //naheed.searchproduct();
        
        Customer me=new Customer("123","ikhlas","r372");
        Customer atiq=new Customer("789","atiq","street5");

        Order mycart=new Order("885", me);
        Order carttwo=new Order("995", atiq);

        mycart.add_to_cart(one);
        carttwo.add_to_cart(two);
        OrderHistory first=OrderHistory.getinstance(mycart);
        first.write_order_in_file();
        OrderHistory second=OrderHistory.getinstance(carttwo);
        second.write_order_in_file();
        //mycart.removefromcart();

        Customerloyalty cl=new Customerloyalty();
        cl.read_order_history();
        cl.writetofile();
    }
}
