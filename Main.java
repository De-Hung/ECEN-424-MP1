import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Scanner is used for gathering user input from the console
        Scanner scanner = new Scanner(System.in);

        //Creating a new instance of the Calculator Class
        Calculator mycalc = new Calculator();
        
        // Assigned group number
        mycalc.setname("Group 41");

        while (true) {

            //Printing the welcome message and additional instructions to the user
            System.out.println("Welcome to the Calculator designed by \"" + mycalc.getname() + "\".");
            System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");

            //User input for the operation...trimmed to avoid leading or tailing whitspaces
            String choice = scanner.nextLine().trim();

            //Exit the loop if the user wants to quit ("Q")
            if (choice.equalsIgnoreCase("Q")) {
                break;
            }

            //If operation is not A,S,M (Case does NOT matter), continue back to welcome message
            if (!choice.equalsIgnoreCase("A") && 
                !choice.equalsIgnoreCase("S") && 
                !choice.equalsIgnoreCase("M")) {
                System.out.println();
                continue;
            }

            //Introducing variables for operation arguments
            Float arg1 = null;
            Float arg2 = null;

            //Gathering both, numeric inputs as a string and converting to a Float
            try {
                System.out.println("Enter argument 1");
                arg1 = Float.parseFloat(scanner.nextLine().trim());

                System.out.println("Enter argument 2");
                arg2 = Float.parseFloat(scanner.nextLine().trim());
            } 
            
            //If argument is not a number, output error message and continue to welcome message
            catch (NumberFormatException e) {
                System.out.println("Error: Input must be a valid number.");
                System.out.println();
                continue;
            }

            //Performing the operations and outputting the results to the console
            if (choice.equalsIgnoreCase("A")) {
                Float res = mycalc.addition(arg1, arg2);
                System.out.println("The sum of " + arg1 + " and " + arg2 + " is " + res);
                System.out.println();
            } else if (choice.equalsIgnoreCase("S")) {
                Float res = mycalc.subtraction(arg1, arg2);
                System.out.println("The difference of " + arg1 + " and " + arg2 + " is " + res);
                System.out.println();
            } else if (choice.equalsIgnoreCase("M")) {
                Float res = mycalc.multiplication(arg1, arg2);
                System.out.println("The product of " + arg1 + " and " + arg2 + " is " + res);
                System.out.println();
            }
        }

        scanner.close();
    }
}