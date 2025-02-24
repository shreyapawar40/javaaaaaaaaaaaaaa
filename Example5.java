import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the speed Limit in km/hrs: ");
        int limit = sc.nextInt();

        try {
            // Check the speed limit
            if (limit >= 120) {
                // Throw an exception if the speed limit is exceeded
                throw new IllegalArgumentException("Speed limit exceeded! Please drive safely.");
            } else {
                System.out.println("No issue with the speed.");
            }
        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        } 
    }
}
