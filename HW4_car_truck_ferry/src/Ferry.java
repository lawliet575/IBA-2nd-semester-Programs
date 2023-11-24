public class Ferry {

    public class Node {
        Truck data;
        Node next;
    
        Node(Truck data){
            this.data=data;
            this.next=null;
        }
    
    }
    
Node head;

public void load(Truck t){ //add last in queue
    Node newnode=new Node(t);

        if(head==null){
          head=newnode;
          return;
        }

        Node current=head;
        while(current.next!=null){
            current=current.next;
        }

        current.next=newnode;


    }

public Truck unload(){ //remove first so sab se pehla element jo dala hoga wo sab se pehle bahir ayega first in first out
    if(head==null){
        return null;
    }

    Truck t=head.data;
    head=head.next;
    return t;
    
}  


public boolean is_sizeavailable(){ 
    if(head==null){
        return true;
    }

    Node current=head;
    int count=0;
    while(current!=null){
        count++;
        current=current.next;
    }

    if(count<=50)
    return true;
    else return false;
}


public int getsize()
    {
        Node temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }



    
}
