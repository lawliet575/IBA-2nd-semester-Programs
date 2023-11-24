package exception_handling;
import java.lang.*;
public class NumberFormatException {

  public static void main(String[] args) {
      String str = "abc";
     try{
              int num = Integer.parseInt(str);//convert string to number
  }
    catch(Exception f){System.err.println("Catching exception "+f);
    System.err.println("Again Catching exception "+f);
    }
     finally{
             
             System.out.println("Error");
     System.out.println("Error");        
     }
     
    }
  }


  /*
   When the try block encounters the line of code where parseInt() method is called on the string "abc", it will throw an exception because "abc" cannot be converted to an integer. The code execution then jumps to the catch block to handle the exception.

Within the catch block, there are two System.err.println() statements that print the error message to the console. The System.err stream is used to print error messages, which is why these statements are displayed before the other System.out statements.

After the catch block is executed, the finally block is executed regardless of whether an exception was thrown or not. This block contains two System.out.println() statements that print the message "Error" to the console.

hence i can conclude that  the output order is not as expected because the exception is thrown and caught, the error message is printed, and then the finally block is executed and prints its messages to the console.
   */

  

