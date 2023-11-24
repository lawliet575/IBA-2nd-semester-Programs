public class Animal {
    String name;
    String sound;


    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void MakeSound(){
        System.out.println("Animal with name: "+name);
        System.out.println("Animal with sound: "+sound);
    }

    
}
