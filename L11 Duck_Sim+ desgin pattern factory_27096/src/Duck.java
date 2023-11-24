public abstract class Duck {
   private FlyingBehaviour fb;
   private QuackBehaviour qb;



    abstract void swim();
    abstract void display();

    Duck(FlyingBehaviour fb, QuackBehaviour qb){
     this.fb=fb;
     this.qb=qb;
    }

    public void performFly(){
        fb.fly();
    }

    public void performquack(){
        qb.quack();
    }

    public void setFlybehaviour(FlyingBehaviour fb){
        this.fb=fb;
    }

    public void setquackbehaviour(QuackBehaviour qb){
        this.qb=qb;
    }



}
