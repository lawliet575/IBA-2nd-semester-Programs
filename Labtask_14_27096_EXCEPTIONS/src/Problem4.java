import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();

        try {
            if (number < 0 || number > 999) {
                throw new InvalidNumberException("Invalid input! Please enter a number between 0 and 999.");
            }


            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println("Sum of digits: " + sum);


        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());

        }

    }

}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    } //this msg passed when i say throw new....
}
