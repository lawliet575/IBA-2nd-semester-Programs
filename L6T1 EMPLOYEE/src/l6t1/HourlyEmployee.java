/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6t1;

/**
 *
 * @author amanlab02
 */
  public class HourlyEmployee extends Employee {
    private double hourly_wage;
    private int no_hours_worked;
    
    public HourlyEmployee(String fname, String lastname, double hourly_wage, int hours_worked){
        super(fname,lastname);
        this.hourly_wage=hourly_wage;
        this.no_hours_worked=hours_worked;   
    }
    
    public double getHourlywage(){
        return hourly_wage;
    }
    
    public int getNoOfhours(){
        return no_hours_worked;
    }
    
    public void setHourlywage(double hourly_wage){
        this.hourly_wage=hourly_wage;
    }
    
    public void setNoOfhours(int hours_worked){
        this.no_hours_worked=hours_worked;
    }
    
     public double earnings(){
        return (this.no_hours_worked*this.hourly_wage);
    }
    
    public String toString(){
       String hw=Double.toString(this.hourly_wage);
       String nh=Double.toString(this.getNoOfhours());
        return (super.toString()+"\n"+hw+"\n"+nh);
    }
    
    
}
