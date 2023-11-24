import java.awt.*;
public class Quadrilateral extends Polygon {
    Color stroke_color;

    public Quadrilateral(int[] x, int[] y, Color c){
        super(x,y,4);
        stroke_color=c;
    }

    public void draw(Graphics g){
        g.setColor(stroke_color);
        g.fillPolygon(xpoints, ypoints, 4);
    }
}
