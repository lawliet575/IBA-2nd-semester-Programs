import java.awt.*;
public class Hexagon extends Polygon {
    Color stoke_color;

    public Hexagon(int[] x, int[] y,Color c){
        super(x,y,6);
        stoke_color=c;
    }

    public void paint(Graphics g){
        g.setColor(stoke_color);
        g.fillPolygon(xpoints, ypoints, 6);
    }

    
}
