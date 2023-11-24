/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class lawyer extends employee { //child class of employee
    
    
    
     
     

    public int getvacationdays() {
        return super.getvacationdays()+5;
    }
   
    public String getvacationform() {
        return super.getvacationform().replaceAll(super.vacform, "pink");
    }
     
     public void sue(){
         System.out.println("I will see you in court.");
     }
    
    
}
