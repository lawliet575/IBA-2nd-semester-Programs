import java.awt.*;
public class Drawing_canvas extends Canvas {
  
    public void paint(Graphics g){ //shapes ke object and values idhar he se pass hongi

      //ALL SHAPES ARE TO BE DRAWN HERE!!!!!
      
       //FOR DRAWING TRIANGLE
         
       int[] xt={150, 250, 200};
       int[] yt={100, 100, 50};
       Triangle t=new Triangle(xt, yt, Color.BLUE); //blue colour triangle
       t.paint(g);//have to call this to output triangle
       
       


      //FOR DRAWING QUADRILATERAL
         
      int[] xq={100, 200, 200, 100}; //these are cooridnates in pairs remember
      int[] yq={200, 200, 300, 300};
      //note these are for square you can make other quadrilietral shapes as well
      Quadrilateral q=new Quadrilateral(xq, yq, Color.BLACK);
      q.draw(g);//can make draw or paint iska taaluq nahi kisi chiz se
        

      //FOR DRAWING PENTAGON
         
      int[] xp={150, 200, 225, 175, 125};
      int[] yp={125, 175, 225, 200, 150};
      for (int i = 0; i < xp.length; i++) {
        xp[i] += 100;
        yp[i] += 200;
    }
      Pentagon p=new Pentagon(xp,yp,Color.GREEN);
      p.paint(g);
      
       

      //FOR DRAWING REGULAR PENTAGON(INHERITANCE PENTAGON)
          
      int[] xrp={250, 300, 350, 325, 275};
      int[] yrp={250, 200, 250, 300, 300};
      for (int i = 0; i < xrp.length; i++) {
        xrp[i] += 100;
        yrp[i] += 200;
    }
      RegularPentagon rp=new RegularPentagon(xrp, yrp, Color.BLACK);
      rp.paint(g);
             
      
      

      //FOR DRAWING PENTAGRAM(INHERITANCE PENTAGON) masla hai
           
      int[] xpr={150, 200, 225, 175, 125, 100};
      int[] ypr={100, 125, 175, 225, 200, 150};
      for (int i = 0; i < xpr.length; i++) {
        xpr[i] += 400;
        ypr[i] += 300;
      }
      Pentagram pn=new Pentagram(xpr, ypr, Color.BLACK);
      pn.paint(g);

         
      
      
      //FOR DRAWING HEXAGON(kind of irregular)
         
      int[] xh={150, 200, 225, 175, 125, 100};//mujhe iske coordinate itne samjh nahi arahe kya dalu
      int[] yh={150, 175, 225, 300, 300, 250};
      for (int i = 0; i < xh.length; i++) {
        xh[i] += 600;
        yh[i] += 300;
      }
      Hexagon h=new Hexagon(xh, yh, Color.RED);
      h.paint(g);
        

      //FOR DRAWING REGULAR HEXAGONN(INHERITANCE HEXAGON)
        
      int x = 300;
      int y = 300;
      int radius = 100;

      //we need to set angles thats why i did this
     int[] xrh = new int[6];
     int[] yrh = new int[6];
     for (int i = 0; i < 6; i++) {
        xrh[i] = (int) (x + radius * Math.cos(i * 2 * Math.PI / 6));
        yrh[i] = (int) (y + radius * Math.sin(i * 2 * Math.PI / 6));
      }

      for (int i = 0; i < xrh.length; i++) {
        xrh[i] += 400;
       // yrh[i] -= 500;
      }
      Regularhexagon rh=new Regularhexagon(xrh, yrh, Color.PINK);
      rh.paint(g);

      


    }

    
       
 
}
