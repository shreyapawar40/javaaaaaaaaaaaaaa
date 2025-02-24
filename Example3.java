import java.util.Scanner;

public class Example3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        try {
            // Perform division
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block will always execute
            System.out.println("Finally block executed");
           
        }

 //System.out.println("Program continues after try-catch-finally.");
    }
}
