import java.util.Scanner;

public class Book extends Bookshelf { //for 1 single book
    private String name;
    private String author;
    private String id;

    public Book(){  //super() yaha pe chalega already
        

        
    }

   public Book(String name,String author,String id){
    this.name=name;
    this.author=author;
    this.id=id;
    
   }

   Book(Book b){
    this.name=b.name;
    this.author=b.author;
    this.id=b.id;
   }


   public void changename(String name){
    this.name=name;
   }

   public void changeauthor(String author){
    this.author=author;
   }

   public void changeid(String id){
    this.id=id;
   }

   public String toString(){
    return (this.name+" "+this.author+" "+" "+this.id);
   }

   public String getname(){
    return this.name;
   }

   public String getauthor(){
    return this.author;
   }

   public String getid(){
    return this.id;
   }

   

   
    
}

