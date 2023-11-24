package exception_handling;

public class ErrorDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Out of memory error: " + e.getMessage());
        }
        
        int x = 5;
        int y = 0;
        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception: " + e.getMessage());
        }
    }
}