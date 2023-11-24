import javax.swing.*;
public class Main_Jframe {
    public static void main(String[] args)  {
        JFrame frame=new JFrame();
        frame.setSize(1000, 1000); //size of display panel
        frame.setTitle("MY FRAME");
        frame.setVisible(true);

        Drawing_canvas canvas=new Drawing_canvas(); //drawing canvas is just like myframe like in youtube
        frame.add(canvas);
        
        
  }

}
