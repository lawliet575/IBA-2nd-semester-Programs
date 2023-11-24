import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //--------READING BOOKS---------//
        java.io.File file=new java.io.File("books.txt");
        Scanner reader=new Scanner(file);
        while(reader.hasNext()){
            String name=reader.next(); String author=reader.next(); String id=reader.next();
            Bookshelf.addbook(name, author, id);
        }

        //------YOU WANNA ADD A BOOK URSELF DO IT HERE BETWEEN THESE SECTIONS----//


        Bookshelf.addbook("Divergant", "SCOLE", "34224");
        Bookshelf.showbookshelf();

       
        //--------WRITING BOOKS OBJECTS ON TEXT FILE-------//
        java.io.File wfile=new java.io.File("Writtenbooks.txt");
        java.io.PrintWriter writer=new java.io.PrintWriter(wfile);

        for(int i=0;i<Bookshelf.allbooks.size();i++){
            writer.print(Bookshelf.allbooks.get(i).getname()+" ");
            writer.print(Bookshelf.allbooks.get(i).getauthor()+" ");
            writer.println(Bookshelf.allbooks.get(i).getid()+" ");
        }

        writer.close();


        Bookshelf.edit_book_at_idx(4);

        
        





       


       //Book b=new Book("HarryPotter","JK Rowling","12564");
       //everytime you make a book you must add it to the bookshelf
       //Bookshelf.addbook(b);
       //Bookshelf.edit_book_at_idx(0);
      
        
    }
}
