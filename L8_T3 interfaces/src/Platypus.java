public class Platypus extends Mammal implements EggLayer{

    @Override
    public void layseggs() {
        System.out.println("Platypus lays eggs ");
    }

    @Override
    public void givesMilk() {
        System.out.println("Platypus gaves milk");
    }
}
