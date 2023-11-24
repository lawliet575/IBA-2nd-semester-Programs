package exception_handling;
public class Throw_Throws {
    public static void main(String[] args) {
       try {
            divide(10, 0);
            System.out.println("Result: ");
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }

    public static void divide(int num1, int num2) throws ArithmeticException{
       
         //   throw new ArithmeticException("Cannot divide by zero");
       
        
    }
}

   

