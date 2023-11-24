import java.util.ArrayList;

public class Librarian  {
    private String name;
    private String ID;

    Librarian(String name,String ID){
        this.name=name;
        this.ID=ID;

    }

    public void addbook(ArrayList<Book> allbooks,Book book){
        allbooks.add(book);

    }

    public void removebook_at_idx(ArrayList<Book> allbooks,int index){
        allbooks.remove(index);

    }

    public void update_bookname(ArrayList<Book> allbooks,int idx,String name){
        allbooks.get(idx).setname(name);

    }

    public void update_bookauthor(ArrayList<Book> allbooks,int idx,String author){
        allbooks.get(idx).setauthor(author);

    }


    public void remove_user_at_idx(ArrayList<User> users,int idx){
        users.remove(idx);
    }

    public void show_All_users(ArrayList<User> users){
        System.out.println("Here are all the current users of library");
        for (int i = 0; i <users.size(); i++) {
            System.out.println(users.get(i));
        }

    
    }

    
    
}
