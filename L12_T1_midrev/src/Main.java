public class Main {
    public static void main(String[] args) {
        Project project = new Project(5000, 10);


        Programmer p1 = new Programmer("John", 1001, 50,180, 2);
        Programmer p2 = new Programmer("Jane", 1002, 45,180, 3);
        project.addEmployee(p1);
        project.addEmployee(p2);


        Tester t1 = new Tester("Mike", 2001,50, 2400);
        Tester t2 = new Tester("Lisa", 2002,50, 220);
        project.addEmployee(t1);
        project.addEmployee(t2);

        int extradays=project.doProject();
        if (extradays == 0) {
            System.out.println("The project was completed on time!");
        } else {
            System.out.println("The project took " + extradays + " extra days to complete.");
        }
        
    }
    
}
