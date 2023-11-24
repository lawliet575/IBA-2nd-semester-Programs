import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shape {
    int x;
    int y; 
    // point coordinates x,y
   int size;
   Color color;
   Random random = new Random();

   Circle(int x,int y,int size){
    this.x=x;
    this.y=y;
    this.size=size;
    color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }

   public void draw(Graphics g){
    g.setColor(color);
    g.fillOval(x-size/2, y-size/2,size,size);

   }

   public String getInfo() {
    // TODO Auto-generated method stub
    return "Circle "+size+" "+x+" "+y;
}

    
}

