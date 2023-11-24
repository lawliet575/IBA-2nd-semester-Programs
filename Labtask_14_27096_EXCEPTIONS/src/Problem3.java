import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number or string: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter second number or string: ");
        String input2 = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(input1);//convert string number to int
            int num2 = Integer.parseInt(input2);//if string is actually a string then goes to catch
            int result = num1 - num2; //ye to seedhe tareeqe  hoga
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            try {
                int num = Integer.parseInt(input2);
                if (num > input1.length()) {
                    System.out.println("Not Possible");
                } else {
                    String result = input1.substring(0, input1.length() - num);
                    System.out.println("Result: " + result);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input");
            }
        }

    }
}
