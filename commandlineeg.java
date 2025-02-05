public class commandlineeg {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java commandlineeg <num1> <operator> <num2>");
            return;
        }

        int var1 = Integer.parseInt(args[0]);
        int var2 = Integer.parseInt(args[2]);
        String symbol = args[1];
        int result = 0;

        switch (symbol) {
            case "+":
                result = var1 + var2;
                break;
            case "-":
                result = var1 - var2;
                break;
            case "*":
                result = var1 * var2;
                break;
            case "/":
                if (var2 != 0) {
                    result = var1 / var2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}