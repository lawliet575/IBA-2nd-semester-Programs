package exception_handling;
public class Stacktrace_message {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error message: " + e.getMessage());
            System.err.println("Stack trace: ");
            e.printStackTrace();
        }
    }
}


