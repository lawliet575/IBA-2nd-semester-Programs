public class Programmer extends Employee {
    double rate;
    double time;//in minutes
    int linesofcodeperday;

    Programmer(String name,int ID,double rate,double time,int linesofcodeperday){
        super(name, ID);
        this.rate=rate;
        this.time=time;
        this.linesofcodeperday=linesofcodeperday;
    }

    @Override
    int work() {
        int temp=(int) (500+ Math.random()*1501 );
        return temp;
    }
        

    @Override
    double salary() {
        double hours=work()*time/60;
        double salary=rate*hours;
        return salary;
    }

    public String toString() {
        return super.toString() + ", Role: Programmer";
    }
    
}
