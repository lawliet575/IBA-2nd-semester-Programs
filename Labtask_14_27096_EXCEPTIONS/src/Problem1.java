import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int num1 = 0;
        String str = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first num: ");
            num1 = sc.nextInt();
            System.out.print("Enter second num: ");
            str = sc.next();
            int num3  = Integer.parseInt(str);
            int result = num1 * num3;
            System.out.println("Result: " + result);
        }

             catch (Exception e) {
            System.out.println("String Format!");
            String result = "";
            for (int i = 0; i < num1; i++) {
                result += str;
            }
            System.out.println("Result: " + result);
        }
        


    }
}
