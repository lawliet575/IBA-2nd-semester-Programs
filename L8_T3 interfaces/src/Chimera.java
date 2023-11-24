public class Chimera implements WaterBreather,EggLayer,MilkProvider,Flyer{

    @Override
    public void layseggs() {
        System.out.println("Chimera layseggs ");
    }

    @Override
    public void flies() {
        System.out.println("Chimera flies ");
    }

    @Override
    public void givesMilk() {
        System.out.println("Chimera gives milk");
    }

    @Override
    public void waterbreathing() {
        System.out.println("Chimera  breathes in water");
    }
}
