class SumTwoNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int sum = number1 + number2;
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers as command-line arguments.");
        }
    }
}
