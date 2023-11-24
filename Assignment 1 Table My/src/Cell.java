import java.awt.*;

public class Cell {
    Point topleft = new Point();
    int width,height,stroke,fontsize;
    int fontstyle = 0;
    Color cell_color, stroke_color, text_color;
    String text;
    Font font;

    Cell(int x, int y, int width, int height, Color cell_color,Color text_color, Color stroke_color,int stroke, String text){
        topleft.x = x;
        topleft.y = y;
        this.width = width;
        this.height = height;
        this.cell_color = cell_color;
        this.stroke_color = stroke_color;
        this.text_color = text_color;
        this.stroke = stroke;
        this.text = text;
    }
    void paint(Graphics g){
        paintNormal(g);
    }
    void paintNormal(Graphics g){
        g.setColor(stroke_color);
        g.fillRect(topleft.x-stroke, topleft.y-stroke, width+stroke*2,height+stroke*2);
        g.setColor(cell_color);
        g.fillRect(topleft.x, topleft.y, width,height);
        g.setColor(text_color);
        int size = Math.min(height, width);
        Font a = new Font("Consolas", fontstyle,(int) (size/1.5));
        g.setFont(a);
        g.drawString(text, topleft.x + 5, topleft.y+(height-height/3));
      
    }
    void paintHighlighted(Graphics g){
        this.fontstyle = 1;
        paintNormal(g);
    }
}