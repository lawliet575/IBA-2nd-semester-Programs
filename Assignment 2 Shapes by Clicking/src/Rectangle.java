import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Rectangle extends Shape {
int x;
int y;
int width;
int height;
Random random = new Random();
Color color;

public Rectangle(int x,int y,int width,int height){
   this.x=x;
   this.y=y;
   this.width=width;
   this.height=height;
   color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
}

public void draw(Graphics g){
    g.setColor(color);
    g.drawRect(this.x, this.y, this.width, this.height);
    g.setColor(color);
    g.fillRect(x, y, width, height);
}

public String getInfo() {
    return "Rectangle "+x+" "+y+" "+height+" "+width;

}
}
