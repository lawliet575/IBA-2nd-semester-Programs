public class Bike implements Vehicle {
    int gear;
    Operator op;

    Bike(int gear){
        this.gear=gear;

    }

    @Override
    public void setOperator(Operator op) {
        this.op=op;
    }


    @Override
    public void Start() {
        System.out.println("Bike started");
        
    }

    public String getvehiclename(){
        return "Bike";
    }

    @Override
    public boolean stop(int distance) { //note:distance in meter
        if(gear>=3){
            if(distance<1000){
                return true;
            }
            else return false;
        }

        else{ //for gear less than 3
          if(distance<100){
            return true;
          }
           else return false;

        }
        
    }

  

    
}
