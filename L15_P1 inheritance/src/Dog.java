public class Dog extends Animal {

    Dog(String name,String sound){
        super(name, sound);

    }

    public void MakeSound(){
        System.out.println("dog with name: "+super.name);
        System.out.println("dog with sound: "+super.sound);
        
    }


    

}
