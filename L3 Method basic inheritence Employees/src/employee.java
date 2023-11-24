/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class employee {
    
    public int hours=40;
    public int salary=40000;
    public int vacdays=10; //2 weeks=10 days means each week has 5 days
    public String vacform="yellow";
    
    public int gethours(){
        return this.hours;
    }
    
    public double getsalary(){
        return this.salary;
    }
    
    public int getvacationdays(){
        return this.vacdays;
    }
    
    public String getvacationform(){
        return this.vacform;
    }
    
    
    
}
