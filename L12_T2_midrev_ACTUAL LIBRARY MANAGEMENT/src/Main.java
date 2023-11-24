import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> Allbooks=new ArrayList<>();
        ArrayList<User> Allusers=new ArrayList<>();

        Book first=new Book("Harry Potter", "JK", "Wizard", true);
        Book second=new Book("Monster book", "Crow", "Magic", true);
        Book third=new Book("Tafsir book", "mufti", "spiritual", true);


        Allbooks.add(first); Allbooks.add(second); Allbooks.add(third);


        User one=new User("Ikhlas", "27096");
        User two=new User("dude", "272121");
        Allusers.add(one); Allusers.add(two);
        one.Checkout_at_idx(Allbooks, 0);
        one.Checkout_at_idx(Allbooks, 1);
        two.Checkout_at_idx(Allbooks, 2);
        //one.Search_book(Allbooks);
        //one.get_single_Book_details_at_idx(Allbooks, 0);
        one.return_book();
       // one.return_book();


        Library library=new Library(Allbooks, Allusers);
        Librarian librarian=new Librarian("Angela", "2121");
        librarian.show_All_users(Allusers);

        







        
    }
}
