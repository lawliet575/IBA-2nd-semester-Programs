import java.awt.*;
import java.io.FileNotFoundException;


// #2
public class DrawingCanvas extends Canvas
{
	public void paint(Graphics g) 
    {  
        Table a = null;
        try {
            a = new Table(40,50,"src/text.txt",Color.green,Color.BLUE, Color.magenta,Color.black, Color.black, Color.MAGENTA,Color.red);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        a.paint(g);
                  
    }  
}
