public class Truck {
    public class Node {
        Car data; 
        Node next;
    
        Node(Car data){
            this.data=data;
            this.next=null;
        }
     
        }
    
Node top;

public void load(Car c){ //addfirst stack: aik ke upar aik ke upar
 Node newnode=new Node(c);
 if(top==null){
    top=newnode;
    return;
 }   

 newnode.next=top;
 top=newnode;

}

public Car unload(){ //remove first sab se 

    if(top==null){
        return null;
    }

    Car c=top.data;
    top=top.next;

    return c;
    

}


public boolean is_sizeavailable(){ //to check for max 20 cars loaded
    if(top==null){
        return true;
    }

    Node current=top;
    int count=0;
    while(current!=null){
        count++;
        current=current.next;
    }

    if(count<=20)
    return true;
    else return false;
}


public int getsize()
    {
        Node temp = top;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }




    
}
