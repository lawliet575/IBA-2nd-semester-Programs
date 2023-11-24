/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem1;

/**
 *
 * @author 27096
 */
public class TestAccessSpecifiers {
    public static void main(String[] args) {
        Accessspecifier obj= new Accessspecifier();
        System.out.println(obj.privateVar); // Private variable and method cannot be accessed outside the class where its initialized
        obj.privatemethod();
        
        System.out.println(obj.protectedVar); // Protected variable can be accessed outside the class where its initialized
        obj.protectedmethod();
        
        System.out.println(obj.defaultVar); // default variable and method can be accessed outside the class where its initialized
        obj.defaultmethod();
        
        System.out.println(obj.publicVar);  // public variable and method can be accessed outside the class where its initialized
        obj.publicmethod();
        
        
    }
    
}
