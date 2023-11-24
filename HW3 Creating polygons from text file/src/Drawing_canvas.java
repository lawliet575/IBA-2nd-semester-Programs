import java.awt.*;
import java.io.*;
import java.util.Scanner;
public class Drawing_canvas extends Canvas {
    public void paint(Graphics g){ //shapes ke object and values idhar he se pass hongi
       
       java.io.File file=new java.io.File("shapedata.txt");
       try (Scanner reader = new Scanner(file)) {
        while(reader.hasNext()){
 
             String shape=reader.next();
             if(shape.equalsIgnoreCase("Triangle")){
               int[] x=new int[3];
               for(int i=0;i<x.length;i++){
                 x[i]=reader.nextInt();
               }
     
                 int[] y=new int[3];
               for(int j=0;j<y.length;j++){
                 y[j]=reader.nextInt();
               }
     
                 String str=reader.next();
                 Color c=getcolorfromstring(str);
                 Triangle t=new Triangle(x, y, c);
                 t.paint(g);      
             }

             if(shape.equalsIgnoreCase("Quadrilateral")){
              int[] x=new int[4];
              for(int i=0;i<x.length;i++){
                x[i]=reader.nextInt();
              }
    
                int[] y=new int[4];
              for(int j=0;j<y.length;j++){
                y[j]=reader.nextInt();
              }
    
                String str=reader.next();
                Color c=getcolorfromstring(str);
                Quadrilateral q=new Quadrilateral(x, y, c);
                q.paint(g);      
            }

            if(shape.equalsIgnoreCase("pentagon")){
              int[] x=new int[5];
              for(int i=0;i<x.length;i++){
                x[i]=reader.nextInt();
              }
    
                int[] y=new int[5];
              for(int j=0;j<y.length;j++){
                y[j]=reader.nextInt();
              }

              for (int i = 0; i < x.length; i++) {
                x[i] += 100;
                y[i] += 200;
            }
    
                String str=reader.next();
                Color c=getcolorfromstring(str);
                Pentagon p=new Pentagon(x, y, c);
                p.paint(g);      
            }

            if(shape.equalsIgnoreCase("regularpentagon")){
              int[] x=new int[5];
              for(int i=0;i<x.length;i++){
                x[i]=reader.nextInt();
              }
    
                int[] y=new int[5];
              for(int j=0;j<y.length;j++){
                y[j]=reader.nextInt();
              }

              for (int i = 0; i < x.length; i++) {
                x[i] += 100;
                y[i] += 200;
            }
    
                String str=reader.next();
                Color c=getcolorfromstring(str);
                RegularPentagon rp=new RegularPentagon(x, y, c);
                rp.paint(g);      
            }

            if(shape.equalsIgnoreCase("pentagram")){
              int[] x=new int[5];
              for(int i=0;i<x.length;i++){
                x[i]=reader.nextInt();
              }
    
                int[] y=new int[5];
              for(int j=0;j<y.length;j++){
                y[j]=reader.nextInt();
              }

              for (int i = 0; i < x.length; i++) {
                x[i] += 400;
                y[i] += 300;
              }
    
                String str=reader.next();
                Color c=getcolorfromstring(str);
                Pentagram pn=new Pentagram(x, y, c);
                pn.paint(g);      
            }

            if(shape.equalsIgnoreCase("hexagon")){
              int[] x=new int[6];
              for(int i=0;i<x.length;i++){
                x[i]=reader.nextInt();
              }
    
                int[] y=new int[6];
              for(int j=0;j<y.length;j++){
                y[j]=reader.nextInt();
              }

              for (int i = 0; i < x.length; i++) {
                x[i] += 600;
                y[i] += 300;
              }
    
                String str=reader.next();
                Color c=getcolorfromstring(str);
                Hexagon h=new Hexagon(x, y, c);
                h.paint(g);      
            }

            if(shape.equalsIgnoreCase("regularhexagon")){
              int x=reader.nextInt();
              int y=reader.nextInt();
              int radius=reader.nextInt();
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


                String str=reader.next();
                Color c=getcolorfromstring(str);
                Regularhexagon rh=new Regularhexagon(xrh, yrh, c);
                rh.paint(g);     
            }

         }
         reader.close();
      }
       
      
      catch (FileNotFoundException e) {
        
      }

    }

    public Color getcolorfromstring(String a){
      String temp=a.toUpperCase();
      switch (temp) {
        case "RED":
        return Color.RED;
      case "BLUE":
        return Color.BLUE;
      case "GREEN":
        return Color.GREEN;
      case "YELLOW":
        return Color.YELLOW;
      case "BLACK":
        return Color.BLACK;
      case "WHITE":
        return Color.WHITE;
      
        default:
          return Color.BLACK;
      }
    }

    
}
