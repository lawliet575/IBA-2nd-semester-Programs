import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        java.io.File file=new java.io.File("Studentdata.txt");
        Scanner reader= new Scanner(file);

        Student[] students=new Student[20];

        int x=0;
        while(reader.hasNext()){
          String fname= reader.next();
          String lname=reader.next();
          int[] marks=new int[5];
          for(int i=0;i<marks.length;i++){
            marks[i]=reader.nextInt();
          }
          students[x++]=new Student(fname,lname,marks);

        }
    
        //FINDING BEST STUDENT
        int beststudentindex=-1;
        double bestavg=0;
        
        for(int i=0;i<students.length;i++){
            if(students[i].safe(students[i])){
                double currentavg=students[i].calcavg(students[i]);
                if(currentavg>=bestavg){
                 bestavg=currentavg;
                 beststudentindex=i;
                }
            }
        }

        if(beststudentindex==-1){
            System.out.println("No best performing student found");
        }
        else{
            System.out.println("The Best performing student with the highest average of "+ bestavg+" is; ");
            students[beststudentindex].getdetails();
        }







    }






}

