public class RubberDuck extends Duck {
//it cannot fly remember

RubberDuck(FlyingBehaviour fb,QuackBehaviour qb){
    super(fb,qb);
    
}

    @Override
    void swim() {
    System.out.println("I can swim!");
    }

    @Override
    void display() {
    System.out.println("I am a rubber duck");
    }
    
}
