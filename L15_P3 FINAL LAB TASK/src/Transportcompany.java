import java.util.ArrayList;
import java.util.Random;

public class Transportcompany {
    Random random;
    Car[] cars=new Car[random.nextInt(50)];
    Bike[] bikes=new Bike[random.nextInt(30)];
    Helicopter[] helicopters=new Helicopter[random.nextInt(10)];
    int requests;
    private Vehicle[] vehicles;
    Vehicle vehicle;
        Operator op;




    Transportcompany(){
        int numCars = (int) (Math.random() * 10) + 1; // random number of cars from 1 to 10
        int numBikes = (int) (Math.random() * 10) + 1; // random number of bikes from 1 to 10
        int numHelicopters = (int) (Math.random() * 3) + 1; // random number of helicopters from 1 to 3
        
        vehicles = new Vehicle[numCars + numBikes + numHelicopters];
        
        for (int i = 0; i < numCars; i++) {
            vehicles[i] = new Car(60);
        }
        
        for (int i = 0; i < numBikes; i++) {
            vehicles[numCars + i] = new Bike(5);
        }
        
        for (int i = 0; i < numHelicopters; i++) {
            vehicles[numCars + numBikes + i] = new Helicopter(3);
        }

        for(int i=0;i<cars.length;i++){
            cars[i]=new Car(50);
        }

        for(int i=0;i<bikes.length;i++){
            bikes[i]=new Bike(30);
        }
        for(int i=0;i<helicopters.length;i++){
            helicopters[i]=new Helicopter(20);
        }
    }

    public void maketrip(int requests){
        if (requests == 1) {
            //vehicle = vehicles[1];
            vehicle=bikes[random.nextInt(bikes.length)];
            op = new Rider("John");
        } else if (requests >= 2 && requests <= 4) {
            //vehicle = vehicles[0];
                        vehicle= cars[random.nextInt(cars.length)];

            op = new Driver("Jane");
        } else {
            //vehicle = vehicles[2];
            vehicle= helicopters[random.nextInt(helicopters.length)];

            op = new Pilot("Mike");
        }
        //to handle that only pilot operates helicopter
            if (vehicle instanceof Helicopter && !(op instanceof Pilot)) {
                System.out.println("Only a pilot can operate a helicopter. Assigning a pilot operator.");
                op = new Pilot("Mike");
            }



        vehicle.setOperator(op);

        //printing all details of trip
        vehicle.Start();//vehicle started
        op.operate();
        System.out.println("There are "+ requests+" people seated in the vehicle"); System.out.println(1);
       
    }
}
