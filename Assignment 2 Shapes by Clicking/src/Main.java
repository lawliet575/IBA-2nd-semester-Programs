import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DrawingFrame frame=new DrawingFrame();//just like myframe
        frame.setSize(800,800);
        frame.setTitle("MY FRAME");
        frame.setVisible(true);
        

        //Drawing_panel panel=new Drawing_panel();
        //frame.add(panel);
    }
}




    
        
    

   