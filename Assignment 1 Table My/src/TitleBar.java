import java.awt.*;

public class TitleBar extends Cell {

    Point xcords = new Point();
    TitleBar(int x, int y, int width, Color titlebarcolor, Color titlebartext, Color titlebarborder, String title) {
        super(x,y,width, 25, titlebarcolor,titlebartext, titlebarborder, 3, title);
    }
    Cell closingbutton = new Cell(topleft.x+width-20, topleft.y+4, 20-4,height-8,Color.red,Color.red,stroke_color,1,"");
    void paint(Graphics g) {
        super.paintHighlighted(g);
        closingbutton.paint(g);
    }
}