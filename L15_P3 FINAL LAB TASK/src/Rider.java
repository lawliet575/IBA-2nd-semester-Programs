public class Rider implements Operator{
    String name;

    


    public Rider(String name) {
        this.name = name;
    }




    @Override
    public void operate() {
        System.out.println(name+" driving vehicle");
    }
    
}
