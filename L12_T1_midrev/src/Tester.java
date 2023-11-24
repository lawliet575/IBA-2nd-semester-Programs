public class Tester extends Employee {
    double rate;
    int linesofcodeperday;

    Tester(String name, int ID,double rate,int linesofcodeperday) {
        super(name, ID);
        this.rate=rate;
        this.linesofcodeperday=linesofcodeperday;
    }

    @Override
    int work() {
        int temp=(int) (150+ Math.random()*251 );
        int temp2=(int)(temp/linesofcodeperday);
        return temp2;
    }

    @Override
    double salary() {
        double salary=work()*rate;
        return salary;
    }

     public String toString() {
        return super.toString() + ", Role: Tester";
    }


    
}