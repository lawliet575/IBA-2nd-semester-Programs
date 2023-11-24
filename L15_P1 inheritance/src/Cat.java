public  class Cat extends Animal {
    Cat(String name,String sound){
        super(name, sound);
    }

    public void MakeSound(){
        System.out.println("cat with name: "+super.name);
        System.out.println("cat with sound: "+super.sound);
        
    }
    
}
