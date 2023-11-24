public class Student {
    String first_name;
    String last_name;
    int[] marks= new int[5];
  //String[] courses= {"Math",randommarks(),"Eng", randommarks(), "Science", randommarks(), "Urdu", randommarks(), "chineese", randommarks()}; //5 courses and 5 marks for each
  //char[] grades= new char[5];
    
    
    
    
    
    
    public Student(String fname, String lname, int[] tempmarks){ //modified for prob4 hw2
        this.first_name=fname;
        this.last_name=lname;
        this.marks=tempmarks;

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
    
    
    
    

    //FOR OOP HW 2 prob4

    public boolean safe(Student currentstd){
        for(int i=0;i<marks.length;i++){
            if(marks[i]<=50)
            return false;
            else continue;
        }
        return true;
    }

    public double calcavg(Student currentstd){
        int total=0;
        for(int i=0;i<marks.length;i++){
           total+=marks[i];
        }
        return  (total/5) ;

    }
    
    public void getdetails(){
        System.out.println("First name: "+ this.first_name);
        System.out.println("Last name: "+ this.last_name);
        System.out.print("Marks: ");
       
        for(int i=0;i<marks.length;i++){  
            System.out.print(marks[i]+" ");
        }
        System.out.println(""); //line change

    }
}
