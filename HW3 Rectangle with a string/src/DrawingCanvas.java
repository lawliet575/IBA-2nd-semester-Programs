import java.awt.*;

public class DrawingCanvas extends Canvas {
    //here will pass parameter to pass to form a shape
    
    public void paint(Graphics g){
        rectangle r=new rectangle(100,100,80,60,50,Color.RED,Color.GREEN);
        r.paint(g); //paint means output in jframe
    } 
}
