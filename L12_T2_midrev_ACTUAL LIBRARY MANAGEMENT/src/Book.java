import java.util.ArrayList;

public class Book {
    private String name; //title
    private String author;
    private String theme; //subject
    private boolean availability;
    ArrayList<String> checkouthistory=new ArrayList<>();


    Book(String name, String author, String theme, boolean availability){
      this.name=name;
      this.author=author;
      this.theme=theme;
      this.availability=availability;
    }
    
    public void setname(String name){
        this.name=name;
    }

    public void setauthor(String author){
        this.author=author;
    }

    public String getname(){
        return name;
    }

    public String getauthor(){
        return author;
    }

    public String gettheme(){
        return theme;
    }

    public String get_availability(){
        if(this.availability==false)
        return "NOT AVAILABLE";
        else return "YES AVAILABLE";
        
    }

    public void change_availability(boolean signal){
        this.availability=signal;
        
    }

    public void update_checkout_history(String name,String ID){
       String a= "Book issued previously by "+name+" "+ID;
       checkouthistory.add(a);
    }

    public String get_checkout_history(){
        String temp="";
    for (int i = 0; i < checkouthistory.size(); i++) {
        temp= temp + checkouthistory.get(i)+"\n";
 
    }
    return temp;
    }


    public String toString(){
        return "Name: "+ this.getname()+"\n"+
               "Author: "+ this.getauthor()+"\n"+ 
               "Theme: "+ this.gettheme()+"\n"+
               "Availability: "+ this.get_availability()+"\n";
              // "Checkout History"+this.get_checkout_history();
               // location search book se pata chal jayega
    }
    
}
