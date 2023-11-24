/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class Janitor extends employee {
    
    @Override
    public int gethours() {
        return super.gethours()*2; 
    }
    
    @Override
    public double getsalary() {
        return super.getsalary()-10000; 
    }
    
    @Override
    public int getvacationdays() {
        return super.getvacationdays()/2; 
    }

    public void clean(){
        System.out.println("Working for the man");
    }


    
    
}
