public class Car implements Vehicle {
    int speed;
    Operator op;

    Car(int speed){
        this.speed=speed;

    }

    @Override
    public void Start() {
        System.out.println("Car started");
        
    }

    public String getvehiclename(){
        return "Car";
    }

    

    @Override
    public boolean stop(int distance) { //stop within gaven distance
        if(speed>distance){ 
            return false; //car cant stop as it covers more distance per second against the gaven distance
        }
        else return true; 
        
    }

    @Override
    public void setOperator(Operator op) {
        this.op=op;
    }

    
}
