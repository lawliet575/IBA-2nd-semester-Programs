package exception_handling;
public class CustomeExceptionExample {
     public static void main(String[] args) {
        try {
            // Call a method that throws a custom exception
            someMethod();
        } catch (MyException e) {
            // Catch the custom exception and handle it
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catch any other exception that may be thrown
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // A method that throws a custom exception
    public static void someMethod() throws MyException,ArrayIndexOutOfBoundsException {
        // Do something that may throw a custom exception
        throw new MyException();
        //throw new ArrayIndexOutOfBoundsException("Exception");
    }
}

// A custom exception class that extends Exception
class MyException extends Exception {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }

}
  

