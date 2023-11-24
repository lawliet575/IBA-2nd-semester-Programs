public class Helicopter implements Vehicle {
    int rotations;
    Operator op;

    Helicopter(int rotations){
        this.rotations=rotations;

    }

    @Override
    public void setOperator(Operator op) {
        this.op=op;
    }



    @Override
    public void Start() {
        System.out.println("Helicopter started");
        
    }

    public String getvehiclename(){
        return "Helicopter";
    }

    @Override
    public boolean stop(int distance) {
        if(rotations>distance){
            return false;
        }
        else return true;
        
    }

}
