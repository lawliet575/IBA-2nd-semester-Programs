/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6t1;

/**
 *
 * @author amanlab02
 */
  public class Employee {
    private String fname;
    private String lname; 
    

    public Employee(String fname, String lname){
        this.fname=fname;
        this.lname=lname;
    }
    
    public String getLname(){
        return lname;
    }
    
     public String getFname(){
        return fname;
    }
     
    public void setLname(String lname){
        this.lname=lname;
    }
    
    public void setFname(String fname){
        this.fname=fname;
    }
    
    
    
    public String toString(){
        return fname+"\n"+lname; //have to edit this later on
        
    }
    
}
