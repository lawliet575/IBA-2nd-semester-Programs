public class Main {
    public static void main(String[] args) {
   Factory fact=new Factory();


   Duck duck=fact.createduck("mallardduck");
   duck.display();
   duck.performFly();
   duck.performquack();
   duck.swim();

   System.out.println();

   Duck duck2=fact.createduck("rubberduck");
   duck2.display();
   duck2.performFly();
   duck2.performquack();
   //can also change behaviour accordingly
   duck2.setFlybehaviour(new Flywithwings());
   duck2.performFly();
   duck2.swim();


   System.out.println();

   Duck duck3=fact.createduck("redheadduck");
   duck3.display();
   duck3.performFly();
   duck3.performquack();
   duck3.swim();

   System.out.println();

   System.out.println("I HAVE USED FACTORY DESIGN PATTERN HERE");
   /* 
   // REASON: Since the creation of duck objects is encapsulated by 
   the use of the factory method. This design pattern would allow to modify the code in future like 
   if we want to add a new type of duck or any new flying or quaking behaviour we only need to create
   new subclass and update the factory method.
*/
}
}