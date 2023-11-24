package exception_handling;
public class NestTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            try {
                arr[3] = 5; // this will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
            int x = 10 / 0; // this will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        }
    }
}
    
