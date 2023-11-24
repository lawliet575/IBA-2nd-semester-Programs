public class Factory {
     Duck duck;

    Factory(){

    }

    public  Duck createduck(String duckType){
        if (duckType.equalsIgnoreCase("MallardDuck")) {
            duck = new MallardDuck(new Flywithwings(), new Quack());
         } else if (duckType.equalsIgnoreCase("RedheadDuck")) {
            duck = new RedHeadDuck(new Flywithwings(), new Mutequack());
         } else if (duckType.equalsIgnoreCase("RubberDuck")) {
            duck = new RubberDuck(new Flynoway(), new Squeak());
         }
         return duck;
      }

    }
    

