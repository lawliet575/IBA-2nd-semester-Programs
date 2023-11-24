public class Employee {
String name;
double salary;
String department;


public Employee(String name, double salary, String department) {
    this.name = name;
    this.salary = salary;
    this.department = department;
}

public String getName() {
    return this.name;
}

public String getSalaryinString() {
    String temp=String.valueOf(this.salary);
    return temp;
}

public String getDepartment() {
    return this.department;
}

public String toString(){
    return "Name: "+getName()+"\n"+
           "Salary: "+getSalaryinString()+"\n"+
           "Department: "+getDepartment();

}


    
}