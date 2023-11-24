package exception_handling;
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 5 / 2; // this will throw an ArrayIndexOutOfBoundsException and an ArithmeticException
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
                catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        }
    }
}
    

