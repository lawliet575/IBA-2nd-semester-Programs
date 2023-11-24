import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 27096
 */
public class Main {
    
    public static String randomname(String[] fname, String[] lname){
        double a=Math.random()*10;
        int b=(int)a; //random number for fname
        
        double c=Math.random()*10;
        int d=(int)c; //random number for lname
        
        return fname[b]+" "+fname[d];
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        
       String[] first_names = new String[10];
        String[] second_names = new String[10];
        first_names[0]="Messi";
        first_names[1]="Neymar";
        first_names[2]="Suarez";
        first_names[3]="Iniesta";
        first_names[4]="Xavi";
        first_names[5]="Busquets";
        first_names[6]="Pique";
        first_names[7]="Mascherano";
        first_names[8]="Alba";
        first_names[9]="Alves";
        
        second_names[0]="Ronaldo";
        second_names[1]="Benzema";
        second_names[2]="Bale";
        second_names[3]="Kroos";
        second_names[4]="Modric";
        second_names[5]="Casemiro";
        second_names[6]="Ramos";
        second_names[7]="Pepe";
        second_names[8]="Carvajal";
        second_names[9]="Marcelo";
        
        Student[] students=new Student[20]; // will contain first name and second name from 
        for(int i=0;i<students.length;i++){
            students[i]=new Student(first_names, second_names); //assign random name and marks directly here inside class
            students[i].getdetails();
            
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
