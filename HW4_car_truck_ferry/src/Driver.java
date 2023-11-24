import java.io.FileNotFoundException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException  {

        ArrayList<Car> all_readcars=new ArrayList<>();
 
        java.io.File file=new java.io.File("cars.txt");
        Scanner read=new Scanner(file);

        while(read.hasNext()){
        String name=read.nextLine();  //1st line read and move to next_line

        String temp=read.nextLine(); //2nd line price
        String[] x=temp.split(":");
        x[1]=x[1].trim();
        String sub=x[1].substring(2);
        double price=Double.parseDouble(sub); 
         
         
        temp=read.nextLine();//3rd line roadworthy
        x=temp.split(":");
        x[1]=x[1].trim();
        sub=x[1].substring(2);
        double priceroadworthy=Double.parseDouble(sub); 

        

        temp=read.nextLine(); //4th line roadtax
        x=temp.split(":");
        x[1]=x[1].trim();
        String[] y=x[1].split(" ");
        int[] roadtax={Integer.parseInt(y[1]), Integer.parseInt(y[4]) };


        
        
        temp=read.nextLine(); //5th line body type
        x=temp.split(":");
        String bodytype=x[1].trim();  //cuts down shuru ki blank spaces

        

        temp=read.nextLine(); //6th line transmission
        x=temp.split(":");
        String transmiss=x[1].trim();

        

        temp=read.nextLine(); //7th line seats
        x=temp.split(":");
        x[1]=x[1].trim();
        int seats=Integer.parseInt(x[1]);


        temp=read.nextLine(); //8th line segment
        x=temp.split(":");
        String segment=x[1].trim();

        temp=read.nextLine(); //9th line intro
        x=temp.split(":");
        String intro=x[1].trim();

        temp=read.nextLine(); //10th line end
        x=temp.split(":");
        String end=x[1].trim();


        Car c=new Car(name, price, priceroadworthy, roadtax, bodytype, transmiss, seats, segment, intro, end);
        all_readcars.add(c);


        }

        //random cars generating and putting in random_allcars array
        Car[] random_allcars=new Car[ (int) (200+Math.random()*800) ]; //between 200 and 1000
        
        for(int i=0;i<random_allcars.length;i++){
            random_allcars[i]=all_readcars.get((int) (Math.random() *3 ) ); //betwenn 0 and 3 inclusive
        }

         
       //TRUCK LOADING in trucks array
        int trucks_count=(int) (random_allcars.length/20);
        Truck[] trucks=new Truck[trucks_count];

        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = new Truck(); // create new Truck object and inittiaze ajeeb yar iski waja se taraveeh nikal gyi
        }
        
      
        int x=0;
        for(int i=0;i<random_allcars.length;i++){
            if(trucks[x].is_sizeavailable())
            trucks[x].load(random_allcars[i]);
            else {
                x++;
                trucks[x].load(random_allcars[i]);
            }

        }

       


        //LOADING TRUCKS IN FERRY
        Ferry ferry=new Ferry(); //only 1 ferry can hold 50 trucks so no array required
        for(int i=0;i<trucks.length;i++){
            ferry.load( trucks[i] );
        }


        System.out.println("press 1 to unload ferry");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        //unloading ferry truck and ultimately car hehehe
       for (int i = 0; i < ferry.getsize(); i++) {
        Truck t=ferry.unload();

               for(int j=0;j<t.getsize();j++){
                Car c=t.unload();
                System.out.println("UNLOADED CAR: "+c);
                System.out.println();
               } 
       }








        





        
        
    }

    
}
