/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author amanlab02
 */

import java.util.*;
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Shape> shapes=new ArrayList<Shape> ();
        
        shapes.add(new Sphere(3.5));
        shapes.add(new Cuboid(2,4,6));
        shapes.add(new Cylinder(5,10));
        shapes.add(new Cube(5.5));
        
        Iterator<Shape> iterator=shapes.iterator();
        
        while(iterator.hasNext()){
            Shape ss=iterator.next();
            System.out.println("Shape: "+ss.getShapetype());
            System.out.println("Volume: "+ss.getVolume());
            System.out.println("Surface Area: "+ss.getSurfaceArea());
            System.out.println();
            
        }
        
        
    }
    
}
