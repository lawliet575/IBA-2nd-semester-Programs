import java.awt.*;



public class rectangle {
    point center;
    int width;
    int height;
    int stroke;
    Color stroke_color;
    Color button_color;
    

    public rectangle(int x,int y,int width, int height,int stroke, Color button_color, Color stroke_color){
        center=new point(x,y);
        this.width=width;
        this.height=height;
        this.stroke=stroke;
        this.button_color=button_color;
        this.stroke_color=stroke_color;
    }

    public void paint(Graphics g){
        g.setColor(stroke_color);
        g.fillRect(center.x-width/2-stroke, center.y-height/2-stroke, width+stroke*2, height+stroke*2);//not sure about last
        g.setColor(button_color);
        g.fillRect(center.x-width/2, center.y-height/2, width, height);

        //specs for written string
        g.setColor(Color.BLACK);
        int fontSize = Math.min(width, height) / 4;
        Font ff = new Font("TimesRoman", Font.BOLD, fontSize);
        g.setFont(ff);
        g.drawString("hello world", center.x - (g.getFontMetrics().stringWidth("hello world") / 2), center.y + (fontSize / 2));
    }

    
}
