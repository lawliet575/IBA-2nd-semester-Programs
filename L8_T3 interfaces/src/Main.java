public class Main {
    public static void main(String[] args) {
        Chimera ch=new Chimera();
        ch.flies();
        ch.layseggs();
        ch.givesMilk();
        ch.waterbreathing();

        Bat b=new Bat();
        b.flies();

        Platypus pp=new Platypus();
        pp.givesMilk(); //here platypus can use this method as its parent class implmements milkprovider interface
        pp.layseggs();

        Mammal mp=new Platypus();
        mp.givesMilk();
        (  (Platypus) mp).layseggs(); //cannot implment as the object is of mammal doesnt implement egglayer interface
        //so it needs to be type casted


    }

}