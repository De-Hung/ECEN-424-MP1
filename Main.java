import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator mycalc = new Calculator();
        
        // Put your assigned group name/number here
        mycalc.setname("Group 5");

        while (true) {
            System.out.println("Welcome to the Calculator designed by \"" + mycalc.getname() + "\"");
            System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("Q")) {
                break;
            }

            if (!choice.equalsIgnoreCase("A") && 
                !choice.equalsIgnoreCase("S") && 
                !choice.equalsIgnoreCase("M")) {
                continue;
            }

            Float arg1 = null;
            Float arg2 = null;

            try {
                System.out.println("Enter argument 1");
                arg1 = Float.parseFloat(scanner.nextLine().trim());

                System.out.println("Enter argument 2");
                arg2 = Float.parseFloat(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Input must be a valid number.");
                continue;
            }

            if (choice.equalsIgnoreCase("A")) {
                Float res = mycalc.addition(arg1, arg2);
                System.out.println("The sum of " + arg1 + " and " + arg2 + " is " + res);
            } else if (choice.equalsIgnoreCase("S")) {
                Float res = mycalc.subtraction(arg1, arg2);
                System.out.println("The difference of " + arg1 + " and " + arg2 + " is " + res);
            } else if (choice.equalsIgnoreCase("M")) {
                Float res = mycalc.multiplication(arg1, arg2);
                System.out.println("The product of " + arg1 + " and " + arg2 + " is " + res);
            }
        }

        scanner.close();
    }
}