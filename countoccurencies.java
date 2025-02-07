public class countoccurencies {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 6}; // Given array
        int target = 2; // Target number to count
        int count = 0;  // Counter variable

        // Loop through the array
        for (int num : arr) {
            if (num == target) {
                count++; // Increase count if the number matches target
            }
        }

        // Print the count of occurrences
        System.out.println("Count of " + target + ": " + count);
    }
}