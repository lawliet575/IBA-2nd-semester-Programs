import javax.swing.*;
public class Main_Jframe {
    public static void main(String[] args)  {
        JFrame frame=new JFrame();
        frame.setSize(1000, 5000); //size of display panel
        frame.setVisible(true);

        Drawing_canvas canvas=new Drawing_canvas();
        frame.add(canvas);
  }

}
