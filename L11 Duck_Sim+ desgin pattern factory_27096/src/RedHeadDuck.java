public class RedHeadDuck extends Duck {

    public RedHeadDuck(FlyingBehaviour fb, QuackBehaviour qb){
        super(fb,qb);
    }

    @Override
    void swim() {
    System.out.println("I can swim");
    }

    @Override
    void display() {
    System.out.println("I am a redhead duck");  
    }
    
}
