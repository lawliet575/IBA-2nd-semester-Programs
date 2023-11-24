public class Manager extends Employee {

    double bonus;

    public Manager(String name, double salary, String department,double bonus) {
        super(name, salary, department);
        this.bonus=bonus;
    }

    public String getbonusinString(){
     String temp=String.valueOf(this.bonus);
     return temp;
    }

    public String toString(){
        return "Manager details: "+"\n"+
               super.toString()+"\n"+
               "bonus: "+getbonusinString();

    }
    
}
