import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1; // First two Fibonacci numbers

        // Printing Fibonacci series using a loop
        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number
            int next = first + second;     // Calculate the next number
            first = second;                // Update first number
            second = next;                  // Update second number
        }
        
        scanner.close();
    }
}