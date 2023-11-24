import javax.swing.*;

public class Main_Jframe {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(1000, 1000); //size of display panel
        frame.setVisible(true);
        DrawingCanvas canvas=new DrawingCanvas();
        frame.add(canvas); //add the canvas drawing to our frame
    }
}
