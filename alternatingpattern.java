public class alternatingpattern {
    public static void main(String[] args) {
        int rows = 5; // Number of pattern rows
        char symbol = '?'; // Start with '?'

        for (int i = 1; i <= rows; i++) { // Loop through rows
            // Determine the number of symbols in the row: (2 * i - 1)
            for (int j = 0; j < (2 * i - 1); j++) { 
                System.out.print(symbol + " ");
            }
            System.out.println(); // Move to the next line

            // Alternate the symbol for the next row
            symbol = (symbol == '?') ? '#' : '?';
        }
    }
} 