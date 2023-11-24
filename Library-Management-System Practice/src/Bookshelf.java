import java.util.Scanner;
import java.util.ArrayList;

 abstract public class Bookshelf {
      static ArrayList<Book> allbooks=new ArrayList<>();
      //static int x=0;


      public static void addbook(Book b){
       allbooks.add(new Book(b));
      }

      public static void addbook(String name,String author,String id){
        allbooks.add(new Book(name,author,id) );
       }

      public static void showbookshelf(){
       for (int i=0;i<allbooks.size();i++) {
        System.out.println(allbooks.get(i));//allbooks[i] ko print krega
       }

      }
      
      public static void edit_book_at_idx(int index){
        System.out.println("Enter 1-->EDIT NAME");
        System.out.println("Enter 2-->EDIT AURHOR");
        System.out.println("Enter 3-->EDIT ID");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n==1){
        System.out.println("Enter new name");
        String name=input.next();
        allbooks.get(index).changename(name);
        }

        if(n==2){
        System.out.println("Enter new author");
        String author=input.next();
        allbooks.get(index).changeauthor(author);
        }

        if(n==3){
            System.out.println("Enter new id");
            String id=input.next();
            allbooks.get(index).changeid(id);
            } 
            
          System.out.println("Here is your updated book details");
          System.out.println(allbooks.get(index));  
      }

      public static void search_for_a_book(){
        System.out.println("Enter 1-->SEARCH BY NAME");
        System.out.println("Enter 2-->SEARCH BY AURHOR");
        System.out.println("Enter 3-->SEARCH BY ID");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n==1){
            System.out.println("Enter name you want to search");
            String searchname=input.next();

            for(int b=0;b<allbooks.size();b++){
                String name= allbooks.get(b).getname();
                if(name.equalsIgnoreCase(searchname)){ 
                    System.out.println("Book at index "+b); 
                  System.out.println(allbooks.get(b));
                }
            }
            }
    

      }

      public static void removebookatidx(int index){
        allbooks.remove(index);

      }


    
}
