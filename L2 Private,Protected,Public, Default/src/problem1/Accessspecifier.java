/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem1;

/**
 *
 * @author 27096
 */
public class Accessspecifier {
    private int privateVar=0;
    protected int protectedVar=0;
     int defaultVar=0; //dont need to mention default type here
    public int publicVar=0;
    
    
    private void privatemethod(){
        privateVar++;
    }
    
    protected void protectedmethod(){
        protectedVar++;
    }
    
     void defaultmethod(){ //default method
        defaultVar++;
    }
     
     
     public void publicmethod(){
         publicVar++;
     }
     
     
     
    
}
