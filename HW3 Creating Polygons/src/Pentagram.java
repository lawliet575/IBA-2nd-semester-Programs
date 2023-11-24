import java.awt.*;
public class Pentagram extends Pentagon {
    Color stoke_color;

    public Pentagram(int[] x,int[] y,Color c){
        super(x, y, c);

    }

    public void paint(Graphics g){
        //super.paint(g); //goes to paint method of parent(pentagon class)
        //have to make lines here
        //NOTE: xpoints have x array 
        //ypoints have y array that were passed above 
        //format x1 y1 x2 y2 below

        //g.setColor(stoke_Color);
        
        g.drawPolygon(xpoints, ypoints, 5);
        g.drawLine(xpoints[0], ypoints[0], xpoints[2], ypoints[2]);
        g.drawLine(xpoints[2], ypoints[2], xpoints[4], ypoints[4]);
        g.drawLine(xpoints[4], ypoints[4], xpoints[1], ypoints[1]);
        g.drawLine(xpoints[1], ypoints[1], xpoints[3], ypoints[3]);
        g.drawLine(xpoints[3], ypoints[3], xpoints[0], ypoints[0]);
        
    }

    
}
