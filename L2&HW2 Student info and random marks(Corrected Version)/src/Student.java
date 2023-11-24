/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 27096
 */
public class Student {
    String first_name;
    String last_name;
    String[] courses= {"Math",randommarks(),"Eng", randommarks(), "Science", randommarks(), "Urdu", randommarks(), "chineese", randommarks()}; //5 courses and 5 marks for each
    //char[] grades= new char[5];
    
    
    
    
    
    public Student(String[] fname, String[] lname){ //constructor
        double a=Math.random()*10;
        int b=(int)a; //random number for fname
        
        double c=Math.random()*10;
        int d=(int)c; //random number for lname
        
        
         this.first_name=fname[b]; //yahi random hoga
         this.last_name= lname[d]; //yahi random hoga
         
         
    }
    
    
    
    public String randommarks(){
        double a=Math.random()*100;
        int b=(int)a;
        String f= Integer.toString(b);
        return f; // b is the random marks
    }
    
    
    private char calcgrade(int a){ //also in course vala part yess //for loop for all odds
        
            
            if(a>90)
             return'A';     
            else if(a>80)
            return'B';
            else if(a>70)
            return'C';
            else if(a>60)
            return 'D';
            else if(a>50)
            return 'E';
            else return'F';
              
    }
    
    
    
    public void getdetails(){
        System.out.println("First name: "+ first_name);
        System.out.println("Last name: "+ last_name);
       
        for(int i=0;i<courses.length;i=i+2){  
            System.out.println(courses[i]+" "+ courses[i+1]+" "+calcgrade(Integer.parseInt(courses[i+1])));
        }
        System.out.println(""); //line change

    }

    //FOR OOP HW 2

    public boolean safe(Student currentstd){
        for(int i=1;i<courses.length;i=i+2){
            int a=Integer.parseInt(courses[i]);
            if(a<=50)
            return false;
            else continue;
        }
        return true;
    }

    public double calcavg(Student currentstd){
        int total=0;
        for(int i=1;i<courses.length;i=i+2){
            int a=Integer.parseInt(courses[i]);
            total+=a;
        }
        return  (total/5) ;

    }



    
    
}
