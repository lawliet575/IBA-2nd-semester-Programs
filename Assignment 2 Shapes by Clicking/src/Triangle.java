import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class Triangle extends Shape {
public ArrayList<Point> coordinates;
int[] xp=new int[3];
int[] yp=new int[3];
Random random = new Random();
Color color;

    public Triangle(int[] x,int[] y){
        this.xp=x;
        this.yp=y;//saves x in xpoints and y in ypoints below
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }

    public Triangle(ArrayList<Point> cordinates){
        this.coordinates=cordinates;
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }

    
    public Triangle(Point[] points, Color randomColor) {
        xp[0]=points[0].getx();
        xp[1]=points[1].getx();
        xp[2]=points[2].getx();
        
        yp[0]=points[0].gety();
        yp[1]=points[1].gety();
        yp[2]=points[2].gety();

        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
        
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillPolygon(xp, yp, 3); //3 as triangle has 3 sides
        
    }


public String getInfo() {
        
        String info = "Triangle ";
        for (int i = 0; i < 3; i++) {
            info += xp[i]+" ";
        }
        for (int i = 0; i < 3; i++) {
            info += yp[i]+" ";
        }
        return info;
    }
    
    
}
