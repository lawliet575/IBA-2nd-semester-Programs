import java.util.ArrayList;

public class Library {
    ArrayList<Book> Allbooks;
    ArrayList<User> Allusers;


    Library(ArrayList<Book> allbooks, ArrayList<User> users){
        this.Allbooks=allbooks;
        this.Allusers=users;
        
    }

    public void popularbook(){
      Book first=Allbooks.get(0);
      int max=-1;;
        for (int i = 0; i < Allbooks.size(); i++) {
        int a=Allbooks.get(i).checkouthistory.size();
        if(a>max){
            first=Allbooks.get(i);
        }
            
        }

        System.out.println("Most popular book is");
        System.out.println(first.toString());
        
    }

    public void borrowedbooks(){
        int books=0;
        for (int i = 0; i < Allusers.size(); i++) {
            books=books+Allusers.get(i).issued_books.size();
            
        }

        System.out.println("Total borrowed books are"+books);




    }

    public void returnedbooks(){
        System.out.println("returned books are" +Allbooks.size());

    }

    
}
