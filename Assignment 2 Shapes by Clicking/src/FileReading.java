//package DrawingClasses;
import java.io.*;
import java.util.Scanner;
import java.awt.Point;
public class FileReading {
    
    private File file = new File("data.txt");
    private Rectangle rect;
    private Circle circ;
    private Triangle tria;
    private Point p;


    public FileReading(Stack shapes) throws FileNotFoundException {

    Scanner myScanner = new Scanner (file);    

        while (myScanner.hasNextLine()) {

            String str = myScanner.nextLine();

            String[] split = str.split(" ");

            if(split[0].equals("Rectangle")) {

                rect = new Rectangle(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]));
                shapes.push(rect);
            }

            if(split[0].equals("Circle")) {

                p = new Point(Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                
                circ = new Circle((int)p.getX(),(int)p.getY(),Integer.parseInt(split[1]));
                shapes.push(circ);
            }

            if(split[0].equals("Triangle")) {

                int[] xVals = new int[3];
                int[] yVals = new int[3];

                for (int i = 1; i < 4; i++) {
                    xVals[i-1] = Integer.parseInt(split[i]);
                }
                for (int i = 4; i < 7; i++) {
                    yVals[i-4] = Integer.parseInt(split[i]);
                }

                tria = new Triangle(xVals, yVals);
                shapes.push(tria);
            }

        }


    }





}
