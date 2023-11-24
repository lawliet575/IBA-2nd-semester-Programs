import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // set random integer value
        }


        System.out.println("Original array: " + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to store the value: ");
        int index = scanner.nextInt();
        System.out.print("Enter the value to store: ");
        int value = scanner.nextInt();

        try {
            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Invalid index");
            }

            arr[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Creating a new array with size " + index);
            int[] newArr = new int[index];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[index - 1] = value;
            arr = newArr;
            System.out.println("New array: " + Arrays.toString(arr));

        }

    }
}
