/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
 public class Sphere extends Shape {
    private double radius;
    
    public Sphere(double radius){
        super();
        this.radius=radius;
        
    }
    
    public double getSurfaceArea(){
        double sa=4*Math.PI*(Math.pow(radius, 2));
        return sa;
    }
    
    public double getVolume(){
        double v=(4/3)*Math.PI*(Math.pow(radius, 3));
        return v;
    }
    
    public String getShapetype(){
        return "Sphere";
    }
    
    
}
