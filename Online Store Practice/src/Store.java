import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;


public class Store {

    ArrayList<Product> ALL_PRODUCTS=new ArrayList<>();
    java.io.File file;
    

    Store() { //instantiate everything
       file=new java.io.File("Product Details.txt");

    }


public void addProducttoStore(Product product) throws FileNotFoundException{
        ALL_PRODUCTS.add(product);
        input_product_details_infile(); //updating text file
    }

    public void deleteproduct() throws FileNotFoundException{
        int index;
     simply_display_ALLPRODUCTS();
     Scanner input =new Scanner(System.in);
     do {
        System.out.println("Enter index of product to delete");
        index=input.nextInt();
     } while (index<0 || index>=ALL_PRODUCTS.size());

     ALL_PRODUCTS.remove(index);
     System.out.println("Product successfully deleted, heres the updated list");
     input_product_details_infile();//updating text file
     display_productdetials_fromfile();
     
     
     

    }

    public void input_product_details_infile() throws FileNotFoundException { //file writing
      if(ALL_PRODUCTS.isEmpty()){
        return;
      }
        //java.io.File file=new java.io.File("Product Details.txt");
      PrintWriter writer=new PrintWriter(file);

        for (int i = 0; i < ALL_PRODUCTS.size(); i++) {
            String temp=ALL_PRODUCTS.get(i).toString();
            writer.println(temp); //now every product in text file
            
        }
        writer.close();

    }

    public void display_productdetials_fromfile() throws FileNotFoundException{
        if(file.length()==0){
            System.out.println("EMPTY file, cannot read");
            return;
        }

        Scanner reader=new Scanner(file);
        System.out.println("STARTING FILE READING FROM TEXT FILE");
        while(reader.hasNext()){
           System.out.println(reader.nextLine());
        }

        reader.close();

        
    }

    public void simply_display_ALLPRODUCTS(){

        if(ALL_PRODUCTS.isEmpty()){
            return;
        }
         int x=0;
        for (int i = 0; i < ALL_PRODUCTS.size(); i++) {
            System.out.println("At index= "+x++);
            System.out.println("-----------");
            System.out.println(ALL_PRODUCTS.get(i));
            System.out.println();
            
        }
    }

    public void display_product_with_qt_lessthan10(){
        if(ALL_PRODUCTS.isEmpty()){
            return;
        }

         System.out.println("Here are the products with quantity less than 10");
        for (int i = 0; i < ALL_PRODUCTS.size(); i++) {
            if(ALL_PRODUCTS.get(i).getQuantity()<10)
            System.out.println(ALL_PRODUCTS.get(i));
            
        }


    }


    public void searchproduct(){
        System.out.println("Enter product name to search");
        Scanner input=new Scanner(System.in);
        String name=input.next();

        for (int i = 0; i < ALL_PRODUCTS.size(); i++) {
            if(ALL_PRODUCTS.get(i).getName().equalsIgnoreCase(name)){
                System.out.println("Here is your searched product");
                System.out.println(ALL_PRODUCTS.get(i));
                return;
            }
        }

        System.out.println("No such product found");
    }

    



    
}
