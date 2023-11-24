import javax.swing.*;

  //#1 
public class DrawingManager {  //main driver class 
      
	    
        public static void main(String[] args) 
        {  
	        DrawingCanvas canvas=new DrawingCanvas();  
	        JFrame frame=new JFrame();  
	        frame.add(canvas);  
	        frame.setSize(1000,1000);  //can edit table size here
	        //f.setLayout(null);  
	        frame.setVisible(true);  
	    }  
  
}  