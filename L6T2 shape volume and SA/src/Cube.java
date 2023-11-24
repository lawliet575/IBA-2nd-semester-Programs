/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanlab02
 */
public class Cube extends Cuboid {
    public Cube(double edge){
        super(edge,edge,edge);
        
    }
    
    public String getShapetype(){
        return "Cube";
    }
    
}
