import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend, divisor, quotient;

        while (true) {
            System.out.print("Enter the 1st number: ");
            dividend = input.nextInt();
            System.out.print("Enter the 2nd number: ");
            divisor = input.nextInt();
            try {
                quotient = dividend / divisor;
                System.out.println("result = " + quotient);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Please enter a non-zero divisor.");
            }
        }


    }
}


