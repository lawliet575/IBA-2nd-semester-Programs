import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car c=new Car(20);
        c.Start(); System.out.println(c.stop(50));
    
        Bike b=new Bike(3);
        b.Start();  System.out.println(b.stop(500));

        Helicopter h=new Helicopter(2);
        h.Start(); System.out.println(h.stop(500));
        System.out.println();


        System.out.println("Input requests");
        Scanner input=new Scanner(System.in);
        int req=input.nextInt();
    
     Transportcompany company = new Transportcompany();
        company.maketrip(req);
                



        
        

     }

    

    


}
