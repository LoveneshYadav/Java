public class countprimes {
    public static void main(String[] args) {
        int count = 0;

        // Loop through numbers from 2 to 1000
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                count++; // Increase count if prime
            }
        }

        // Print total count of prime numbers
        System.out.println("Total prime numbers between 1 and 1000: " + count);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;

        // Check divisibility up to square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // Not prime
        }

        return true; // Prime number
    }
}