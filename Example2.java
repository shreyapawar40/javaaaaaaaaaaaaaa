import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30}; // Small array

        System.out.println("Enter two numbers:");
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        System.out.println("Enter an index (0 to 2):");
        int index = sc.nextInt();

        try {
            System.out.println("Division result: " + (numerator / denominator));
            System.out.println("Array value: " + numbers[index]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        } finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
