import java.awt.*;
public class Pentagon extends Polygon {
    Color stoke_Color; //its basically the color of polygon
    public Pentagon(int[] x,int[] y ,Color c){
        super(x,y,5); //this should be first statement always
        //sets x to xpoints and y to y points
        stoke_Color=c;
        

    }

    public void paint(Graphics g){
        g.setColor(stoke_Color);
        g.fillPolygon(xpoints, ypoints, 5);
        //i recommend to use drawpolygon for pentagram
        //and fill polygon for all other polygons

        
        
        


    }
    
}
