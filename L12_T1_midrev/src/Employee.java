
public abstract class Employee {
    private String name;
    private int ID;

    Employee(String name,int ID){
        this.name=name;
        this.ID=ID;

    }

    abstract int work();
    abstract double salary();

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public String toString() {
        return "Employee: " + name + " (ID: " + ID + ")";
    }

    

    
}