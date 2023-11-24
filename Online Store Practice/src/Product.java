public class Product { //for a single product
    String id;
    String name;
    String description;
    double price;
    int Quantity;


    public Product(String id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        Quantity = quantity;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return Quantity;
    }


    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String toString(){
        return "Name : "+getName()+"\n"+
               "ID : "+getId()+"\n"+
               "Description : "+getDescription()+"\n"+
               "Price : "+getPrice()+"\n"+
               "Quantity : "+getQuantity();
               
    }


    

    
    
}
