/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6t1;

/**
 *
 * @author amanlab02
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Employee[] ep=new Employee[5];
      ep[0]=new SalaryEmployee("David","Beckham",100.0);
      ep[1]=new SalaryEmployee("Alba","Jordi",500.0);
      ep[2]=new SalaryEmployee("Alvin","lestrange",800.0);
      ep[3]=new HourlyEmployee("Tom","riddle",600.0,10);
      ep[4]=new HourlyEmployee("harry","potter",700.0,20);
      
        
      for(Employee e:ep){
          if(e instanceof SalaryEmployee){
              System.out.println( ((SalaryEmployee) e).earnings()  ); 
              System.out.println(((SalaryEmployee) e));
          }
          
          else if (e instanceof HourlyEmployee){
              System.out.println(   ( (HourlyEmployee) e ).earnings());
              System.out.println(   ( (HourlyEmployee) e ));
          }

          System.out.println();
      }
      
        
      
      
      
      
        
        
    }
    
}
