/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
 public class Cylinder extends Shape {
    private double height;
    private double radius;
    
    public Cylinder(double height,double radius){
    this.height=height;
    this.radius=radius;
    }
    
    public double getSurfaceArea(){
        double sa=2*radius*Math.PI*(radius+height);
        return sa;
    }
    
    public double getVolume(){
        double v=height*Math.PI*(Math.pow(radius,2));
        return v;
    }
    
    public String getShapetype(){
        return "Cylinder";
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String toString(){
        return "";
    }
    
    
}
