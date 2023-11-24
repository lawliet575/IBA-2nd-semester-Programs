public class Driver implements Operator {
     String name;



    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name+" operating vehicle");

    }
    
}
