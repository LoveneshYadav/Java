public class commandlinecalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            String operator = args[1];

            switch (operator) {
                case "+":
                    System.out.println("Sum: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Difference: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Product: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Quotient: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, *, or /");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Please enter valid integers.");
        }
    }
}