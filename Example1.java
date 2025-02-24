
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Handle Divide by Zero
        try {
            System.out.print("Enter a number to divide: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter a number to divide by: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2; // This may throw ArithmeticException if num2 is 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Handle Array Index Out of Bounds
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter the index to access in the array: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]); // This may throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // Handle Number Format
        try {
            System.out.print("Enter a number (without decimal): ");
            String input = scanner.next(); 
            int num = Integer.parseInt(input); // This may throw NumberFormatException if input is not a valid number
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }

        // Handle Null Pointer
        try {
            String str = null;
            System.out.println("Length of string: " + str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception.");
        }

        scanner.close();
    }
}
