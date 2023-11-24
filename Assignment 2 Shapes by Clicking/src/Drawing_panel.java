


import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.SwingUtilities;
// what i have to do here 
//mouse,button random colour
// store shapes in stacks
public class Drawing_panel extends JPanel implements MouseListener, MouseMotionListener,KeyListener {
 int startx;
 int starty;
 int endx;
 int endy;
 int currentshape;
 Graphics g;
 Random rand=new Random();
 Stack shapes = new Stack();
 Stack undo_redo = new Stack();
 ArrayList<Integer> clickX = new ArrayList<>();
 ArrayList<Integer> clickY = new ArrayList<>();
 FileReading fr;
 FileWrite fw;
 //Triangle triangle;
 //ArrayList<Shape> shapes=new ArrayList<Shape>();
 //Point[] points=new Point[3];
 int clicks=0; 
 Stack st;
 Queue redo;
 Shape latest;
 //java.io.File file=new java.io.File("Shapedata.txt");
 


 public Drawing_panel() throws FileNotFoundException{
    setBackground( Color.WHITE );
	setPreferredSize( new Dimension( 600, 600 ) );
    this.addMouseListener( this );
	this.addMouseMotionListener(this  );
	this.addKeyListener(this);
	setFocusable(true);


    fr=new FileReading(shapes);
 }


   public void paintComponent(Graphics g){
    super.paintComponent(g); // ye method hamesha chalta hai ise kisi call ke zrurat nahi
    g.drawString("PRESS 1 FOR CIRCLE, 2 FOR RECTANGLE, 3 FOR TRIANGLE,", 20, 20);
    shapes.drawAll(g);
    /* 
    for(Shape sh:shapes ){
        if(sh instanceof Triangle){
        g.drawString("This is a Triangle", 190, 400);
        }
        else if(sh instanceof Circle){
          g.drawString("This is a Circle", 250, 600);
         
        }
        else if(sh instanceof Rectangle){
          g.drawString("This is a Rectangle", 150, 700);
        }
        //st.push(sh);

        sh.draw(g);
    */
    
    }


private void setUpDrawingGraphics()
	{
		g = getGraphics();		
		shapes.drawData(g);
		
	}

@Override
public void keyPressed(KeyEvent e) {
char key=e.getKeyChar();
if(key=='1'){ //rectangle
    currentshape=1;
}
else if(key=='2'){ //circle
    currentshape=2;
}
else if(key=='3'){ //triangle
    currentshape=3;
}


}

@Override
public void mousePressed(MouseEvent e) {

    
    
    if(SwingUtilities.isLeftMouseButton(e)){

        undo_redo.clearStack();
        startx=e.getX();
        starty=e.getY();
        /* 
        switch (currentshape) {
            
            case 1:
            int xr=e.getX();
            int yr=e.getY();           
            Shape rect=new Rectangle(xr, yr, 100, 150);
            shapes.add(rect);
            repaint();
            break;


            case 2:
            int xc=e.getX();
            int yc=e.getY();
            Shape circ=new Circle(xc, yc, 100);
            shapes.add(circ); 
            repaint();
            break;

            case 3:
            startx=endx=e.getX();
            starty=endy=e.getY();
            repaint();
            break;

                default:
                break;
     } 
     */
       
    }

        if(SwingUtilities.isRightMouseButton(e)){
		
			//undo function
			if(shapes.stackSize() != 0)
			undo_redo.push(shapes.pop());
			System.out.println("stack size: "+shapes.stackSize());
			System.out.println("rightpresed: qsize: "+undo_redo.stackSize());
			g.clearRect(0, 0, 600, 600);
			g.drawString("1: Circle 2: Rectangle 3: Triangle", 340, 590);
			shapes.drawAll(g);
        
            
		}


		if(SwingUtilities.isMiddleMouseButton(e)) {	
			
			if(undo_redo.stackSize() != 0) {
                //redo function
			shapes.push(undo_redo.pop());
			setUpDrawingGraphics();
			System.out.println("stack size: "+shapes.stackSize());
			System.out.println("middle presed: qsize: "+undo_redo.stackSize());
            }

        }
					
}
        

        @Override
        public void mouseDragged(MouseEvent e) {
    
            if(SwingUtilities.isLeftMouseButton(e)) {
    
            if(currentshape==1){
                
                //draws a circle as the mouse drags
                int xSqr = (int)Math.pow((double) e.getX()-startx, 2);
                int ySqr = (int)Math.pow((double) e.getY()-starty, 2);
    
                int diam = (int) Math.sqrt(ySqr+xSqr);
    
                Shape temp = new Circle(startx,starty,diam);
                temp.draw(g);
                repaint();			
            
            }
    
            if(currentshape==2){
                //draws a rectangle as the mouse drags
                int width = Math.abs(e.getX() - startx);
                int height = Math.abs(e.getY() - starty);
                int x = Math.min(startx, e.getX());
                int y = Math.min(starty, e.getY());
                
               Shape temp=new Rectangle(x, y, width, height);
                temp.draw(g);
                repaint();
                
            }
    
        }
    }
                        
            
        
@Override
public void mouseReleased(MouseEvent e) {

    if(SwingUtilities.isLeftMouseButton(e)){

       /* */
        if(currentshape==2){ 
            int width = Math.abs(e.getX() - startx);
                int height = Math.abs(e.getY() - starty);
                int x = Math.min(startx, e.getX());
                int y = Math.min(starty, e.getY());
                
               Shape temp=new Rectangle(x, y, width, height);
            //Shape temp = new Rectangle(startx,starty,e.getY()-starty,e.getX()-startx);
            //shapes are pushed to stack once mouse is released
            shapes.push(temp);
            setUpDrawingGraphics();
            System.out.println("stack size: "+shapes.stackSize());
        }
       
       if(currentshape==1) { //circle

            int xSqr = (int)Math.pow((double) e.getX()-startx, 2);
            int ySqr = (int)Math.pow((double) e.getY()-starty, 2);

            int diam = (int) Math.sqrt(ySqr+xSqr);

            Shape circ = new Circle(startx,starty,diam);
            //shapes are pushed to stack once mouse is released
            shapes.push(circ);
            setUpDrawingGraphics();
            System.out.println("stack size: "+shapes.stackSize());

        }

   
        if(currentshape==3){ //triangle

    Point midPoint;
    if (startx > endx)
    midPoint = new Point((endx +(Math.abs(startx - endx)/2)),e.getY());
 else 
    midPoint = new Point((endx -(Math.abs(startx - endx)/2)),e.getY()); 
 int[] xs = { startx, endx, midPoint.x };
 int[] ys = { starty, starty, midPoint.y };  
 
 Shape tri=new Triangle(xs, ys);
 shapes.push(tri);
 startx=starty=endx=endy=0;
 repaint();
 st.push(tri);
    }

    
}
    
}

@Override
public void mouseMoved(MouseEvent e) {
    setUpDrawingGraphics();
}

@Override
public void keyReleased(KeyEvent e) {
} 

@Override
public void mouseClicked(MouseEvent e) {

		
		//triangle drawing (stores clicks in arrayList and passes their cordinates to int arrays that calls traingle constr)
		if(SwingUtilities.isLeftMouseButton(e)) {
            if(currentshape==3) {	
                    
                clickX.add(e.getX());
                clickY.add(e.getY());
    
                if(clickX.size() % 3 == 0 && clickY.size() % 3 == 0) {
                    
                    if(clickX.size() > 3) {
    
                        for (int i = 0;;) {
    
                            clickX.remove(i);
                            clickY.remove(i);
                            if(clickX.size()==3) break;
                        }					
    
                    }
    
                    int[] Xs = new int[3];
                    int[] Ys = new int[3];				
    
                    for (int i = 0; i < 3; i++) {
                        Xs[i] = clickX.get(i);
                        Ys[i] = clickY.get(i);
                    }				
    
                    Shape temp = new Triangle(Xs, Ys);
                    shapes.push(temp);
    
                    setUpDrawingGraphics();		
                    System.out.println(shapes.stackSize());		
    
                }
                    
            }
        }
        

}

@Override
public void mouseExited(MouseEvent e) {
}

@Override
public void keyTyped(KeyEvent e) {
}


@Override
public void mouseEntered(MouseEvent e) {
   
}

public Stack getStack() {
    return shapes;
}
    
}



