import java.util.Scanner;

public class Customer {
    String id;
    String name;
    String address;
    public Customer() {
        Scanner input=new Scanner(System.in);
        System.out.println("Taking Customer details");
        System.out.println("Enter id");
        this.id=input.next();
        System.out.println("Enter name");
        this.name=input.next();
        System.out.println("Enter address");
        this.address=input.next();
    }

    public Customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        System.out.println("Customer information: ");
        return "Name: "+ getName()+"\n"+
               "Id: "+getId()+"\n"+
               "Address: "+getAddress()+"\n";
    }

    

    
    
}
