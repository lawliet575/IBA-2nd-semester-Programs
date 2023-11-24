import java.awt.*;
public class Triangle extends Polygon {
Color stroke_color;
    public Triangle(int[] x,int[] y,Color c){
        super(x,y,3);//saves x in xpoints and y in ypoints below
        stroke_color=c;
    }

    public void paint(Graphics g){
        g.setColor(stroke_color);
        g.fillPolygon(xpoints, ypoints, 3); //3 as triangle has 3 sides
    }
    
}
