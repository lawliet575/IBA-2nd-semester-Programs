/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
abstract public class Shape {
    private static int numshapes;
    private int id;
    
    public Shape(){
        numshapes++;
    }
    
    public int getNumShapes(){
        return numshapes;
    }
    
    public int getid(){
        return id;
    }
    
    public String toString(){
        return "";
    }
    
    abstract public double getVolume();
    abstract public double getSurfaceArea();
    abstract public String getShapetype();
    
    
}
