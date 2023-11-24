import java.awt.*;
import java.io.*;
import java.util.*;

//#3
public class Table {
    int rows = 15;
    int columns = 5;
    int x,y;
    String filepath;
    Cell[][] cells = new Cell[rows][columns];
    TitleBar titleBar;
    File dataFile;
    Color titlebarcolor = Color.BLACK;
    Color titlebartextcolor = Color.lightGray;
    Color bordercolor = Color.blue;
    Color textcolor = Color.black;
    Color cellcolor = Color.lightGray;
    Color headingcolor = Color.cyan;
    Color titlebarbordercolor = Color.lightGray;

      Table(){ //empty constructor

      }  


    Table(int x, int y, String filepath) throws FileNotFoundException {
        this.x = x;
        this.y = y;
        this.filepath = filepath;
        dataFile = new File(filepath);
        if (dataFile.length()>0) FromFile(); else initDefault();
    }
    Table(int x, int y, String filepath, Color titlebarcolor, Color titlebarbordercolor, Color titlebartextcolor, Color textcolor, Color bordercolor, Color cellcolor, Color headingcolor) throws FileNotFoundException {
        this.titlebarcolor = titlebarcolor;
        this.titlebarbordercolor = titlebarbordercolor;
        this.titlebartextcolor = titlebartextcolor;
        this.textcolor = textcolor;
        this.bordercolor = bordercolor;
        this.cellcolor = cellcolor;
        this.headingcolor = headingcolor;
        this.x = x;
        this.y = y;
        this.filepath = filepath;
        dataFile = new File(filepath);
        if (dataFile.length()>0) FromFile(); else initDefault();
    }
    void initDefault(){
        titleBar = new TitleBar(x,y,(90+3)*columns-3,titlebarcolor,titlebartextcolor, titlebarbordercolor,"data table");
        int x_change = x;
        int ychange = y+25+3;
        for (int i = 0; i <cells.length; i++) {
            for (int j = 0; j <cells[1].length ; j++) {
                cells[i][j] = (i!=0) ? new Cell(x_change,ychange,90,20,cellcolor,textcolor,bordercolor,3,"default") : new Cell(x_change,ychange,90,20,headingcolor,textcolor, bordercolor,3,"default");
                x_change +=90+3;
            }
            x_change = x;
            ychange += 20+3;
        }
    }
    void FromFile() throws FileNotFoundException {
        rows = 0;
        columns = 0;
        Scanner count = new Scanner(dataFile);
        while(count.hasNext()){
            String str1 = count.nextLine();
            String[] arr = str1.split(", ");
            if (arr.length>columns) columns = arr.length;
            rows++;
        }
        rows--;
        cells = new Cell[rows][columns];
        Scanner read = new Scanner(dataFile);
        titleBar = new TitleBar(x,y,((600/columns)+3)*columns-3,titlebarcolor,titlebartextcolor,titlebarbordercolor,read.nextLine());
        int x_change = x;
        int ychange = y+25+3;
        for (int i = 0; i <cells.length; i++) {
            String str1 = read.nextLine();
            String[] arr = str1.split(", ");
            for (int j = 0; j <cells[1].length ; j++) {
                try{
                cells[i][j] = (i!=0) ? new Cell(x_change,ychange,600/columns,(int) (300/rows),cellcolor,textcolor,bordercolor,3,arr[j]) : new Cell(x_change,ychange,600/columns,(int) (300/rows),headingcolor,textcolor,bordercolor,3,arr[j]);}
                catch (IndexOutOfBoundsException e) {}
                x_change +=(600/columns)+3;
            }
            x_change = x;
            ychange += (int) (300/rows)+3;
        }
    }
    void paint(Graphics g){
        titleBar.paint(g);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[1].length; j++) {
                try {
                    //if (i == 0) { //i guess no need for this hastle
                    //    cells[i][j].paintHighlighted(g);
                    //} else
                    cells[i][j].paintNormal(g);
                } catch (NullPointerException e){}
            }
        }
    }
}
