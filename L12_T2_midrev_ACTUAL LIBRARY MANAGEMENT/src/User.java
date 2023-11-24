import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String ID;
     ArrayList<Book> issued_books=new ArrayList<>();

    User(String name,String ID){
    this.name=name;
    this.ID=ID;

    }

    public void Search_book(ArrayList<Book> allbooks){
        System.out.println("Enter 1-->SEARCH BY NAME");
        System.out.println("Enter 2-->SEARCH BY AUTHOR");
        System.out.println("Enter 3-->SEARCH BY THEME");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        switch (n) {
            case 1:
            System.out.println("Enter name");
            String name=input.next();
            for (int i = 0; i < allbooks.size(); i++) {
                if( name.equalsIgnoreCase( allbooks.get(i).getname() ) ){
                 System.out.println("Book found at index "+i);
                 return;
                }
            }  
            break;


            case 2:
            System.out.println("Enter author");
            String author=input.next();
            for (int i = 0; i < allbooks.size(); i++) {
                if( author.equalsIgnoreCase( allbooks.get(i).getauthor() ) ){
                 System.out.println("Book found at index "+i);
                 return;
                }
            }
            break;


            case 3:
            System.out.println("Enter theme");
            String theme=input.next();
            for (int i = 0; i < allbooks.size(); i++) {
                if( theme.equalsIgnoreCase( allbooks.get(i).gettheme() ) ){
                 System.out.println("Book found at index "+i);
                 return;
                }
            }
            break;    
        
            default: 
            System.out.println("NO Such book found");
                break;
        }

        
    }
    

    public void get_single_Book_details_at_idx(ArrayList<Book> allbooks,int index){
        System.out.println( allbooks.get(index)   ); //tostring chalega yaha
            
    }

    public void Checkout_at_idx(ArrayList<Book> allBooks, int index){
        allBooks.get(index).change_availability(false);//when chekout so book not available
        allBooks.get(index).update_checkout_history(this.name,this.ID);
        Book temp=allBooks.get(index);
        issued_books.add(temp);

    }

    public void return_book(){
        if(issued_books==null){
            System.out.println("you have currently no books");
            return;
        }

        System.out.println("So these are your issued books");
        for (int i = 0; i < issued_books.size(); i++) {
            System.out.println("At index "+i+" you have issued "+issued_books.get(i).getname());
            
        }

        System.out.println("Type index which you wanna return");
        Scanner input=new Scanner(System.in);
        int idx=input.nextInt();
        issued_books.get(idx).change_availability(true);
        issued_books.remove(idx);
        System.out.println("Book successfully returned");

    }


    public void renew_book(){
        if(issued_books==null){
            System.out.println("you have currently no books");
            return;
        }

        System.out.println("So these are your issued books");
        for (int i = 0; i < issued_books.size(); i++) {
            System.out.println("At index "+i+" you have issued"+issued_books.get(i).getname());
            
        }

        System.out.println("Type index which you wanna renew");
        Scanner input=new Scanner(System.in);
        int idx=input.nextInt();
        issued_books.get(idx).change_availability(false);
        System.out.println("Book successfully renewed");
        System.out.println();

    }

    public String toString(){
        String temp="";
        for (int i = 0; i < issued_books.size(); i++) {
            temp=temp+issued_books.toString();
            
        }
        return "User Name: "+this.name+"\n"+
               "User ID: "+this.ID+"\n"+
               "Issued books"+"\n"+temp+"\n";


    }
}
