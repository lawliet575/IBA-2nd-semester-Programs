public class Main {
    public static void main(String[] args) {
        Employee manager=new Manager("Messi", 15000, "Football", 5000);
        System.out.println(manager.toString());
        System.out.println();
        Employee Dev=new Developor("Ronaldo", 10000, "Cricket", "Japanese");
        System.out.println(Dev.toString());

    }
    
}
