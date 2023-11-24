/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
 public class Cuboid extends Shape {
    private double length;
    private double breadth;
    private double height;
    
    public Cuboid(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        
    }
    
    public double getSurfaceArea(){
        double sa=length*breadth*height;
        return sa;
    }
    
    public double getVolume(){
        double v=2*(length*breadth+ breadth*height+ height*length);
        return v;
    }
    
    public String getShapetype(){
        return "Cuboid";
    }
    
    public double getLength(){
        return length;
    }
    
    public double getbreadth(){
        return breadth;
    }
    public double getheight(){
        return height;
    }
    
    public String toString(){
        return "";
    }
    
    
    
    
    
}
