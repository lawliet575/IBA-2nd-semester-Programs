import java.util.ArrayList;

public class Project {
    int linesofCode;
    int linesofCodeWritten;
    int linesofCodeTested;
    int duration;
    ArrayList<Employee> employees;


    Project(int linesofCode, int duration){
        this.linesofCode=linesofCode;
        this.duration=duration;
        this.employees=new ArrayList<>();

    }

    void addEmployee(Employee e){
        employees.add(e);
    }

    public int doProject() {
        int daysTaken = 0;
        int linesOfCodeRemaining = linesofCode - linesofCodeWritten;
    
        while (linesofCodeWritten < linesofCode) {
            for (Employee employee : employees) {
                if (employee instanceof Programmer) {
                    Programmer programmer = (Programmer) employee;
                    int linesOfCodeWrittenToday = programmer.work();
                    linesofCodeWritten += linesOfCodeWrittenToday;
                } else if (employee instanceof Tester) {
                    Tester tester = (Tester) employee;
                    int linesOfCodeTestedToday = tester.work();
                    linesofCodeTested += linesOfCodeTestedToday;
                }
            }
    
            daysTaken++;
    
            // Check if the project is taking too long and add more employees if needed
            int linesOfCodeRemainingAfterDay = linesofCode - linesofCodeWritten;
            int estimatedDaysRemaining = (int) Math.ceil((double) linesOfCodeRemainingAfterDay / linesofCode);
    
            if (daysTaken + estimatedDaysRemaining > duration) {
                if (linesOfCodeRemainingAfterDay > 0) {
                    if (employees.stream().filter(e -> e instanceof Tester).count() < 2) {
                        addEmployee(new Tester("New Tester", 0,20, linesofCode));
                    } else {
                        addEmployee(new Programmer("New Programmer", 0, linesofCode, 0, 0));
                    }
                }
            }
        }
    
        return duration - daysTaken;
    }
    
    
}
