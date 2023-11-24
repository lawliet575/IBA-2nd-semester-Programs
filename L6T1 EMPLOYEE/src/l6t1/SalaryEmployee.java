/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6t1;

/**
 *
 * @author amanlab02
 */
 public class SalaryEmployee extends Employee {
    private double weeklysalary;
    
    
    public SalaryEmployee(String fname, String lastname, double weeklysalary){
        super(fname,lastname);
        this.weeklysalary=weeklysalary;
    }
    
    public double getWeeklySalary(){
        return weeklysalary;
    }
    
    public void setWeeklySalary(double weeklysalary){
        this.weeklysalary=weeklysalary;
    }
    
    public double earnings(){
        double s=this.weeklysalary*4;
        return s;
    }
    
    public String toString(){
        String d=Double.toString(this.getWeeklySalary());
        return (super.toString()+"\n"+d);
    }
    
}
