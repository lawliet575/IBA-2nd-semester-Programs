package problem33;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 27096
 */
public class point {
    private int x;
    private int y;
    point(int x, int y){
        this.x=x;
        this.y=y;
        
    }
    
    public boolean equals(){
        if(x==y)
            return true;
        else return false;
    }
    
    public String toString(){
        return ("x = "+x+"\ny= "+y);
    }
    
}
