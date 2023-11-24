public class Pilot implements Operator,Flyer{
    String name;

    Pilot(String name){
        this.name=name;
    }

    @Override
    public void operate() {
        System.out.println(name+" operating helicopter");
    }
  
    @Override
    public void flies(){
        System.out.println(name+" pilot flying helicopter");
    }

    
}
