package JavaBasic;
import java.util.Scanner;

class Operation {
    public Operation() {
        System.out.println("Enter the Operation Like Add, Sub, Mul, or Div.");
    }

    int Add(int a, int b) {
        return a + b;
    }

    int Sub(int a, int b) {
        return a - b;
    }

    int Mul(int a, int b) {
        return a * b;
    }

    int Div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Returning 0 as a default value
        }else if(a<b){
        	System.out.println("Error: Division by lest Number is not allowed.");
            return 0; // Returning 0 as a default value
        }
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String doAgain = "Yes"; // Initialize variable
        while (doAgain.equalsIgnoreCase("Yes")) { // Use equalsIgnoreCase for comparison
        
            System.out.print("Enter the Number 1: ");
            int n1 = scan.nextInt();

            System.out.print("Enter the Number 2: ");
            int n2 = scan.nextInt();
            
            Operation ob1 = new Operation();

            scan.nextLine(); // Consume the leftover newline
            System.out.print("Enter the Operation: ");
            String input = scan.nextLine();
           
            switch (input) {
                case "Add": {
                    System.out.println("num1 + num2 = " + ob1.Add(n1, n2));
                    break;
                }
                case "Sub": {
                    System.out.println("num1 - num2 = " + ob1.Sub(n1, n2));
                    break;
                }
                case "Mul": {
                    System.out.println("num1 x num2 = " + ob1.Mul(n1, n2));
                    break;
                }
                case "Div": {
                    System.out.println("num1 / num2 = " + ob1.Div(n1, n2));
                    break;
                }
                default: {
                    System.out.println("Invalid Operation!");
                }
            }
            System.out.print("Do you want to calculate another operation? Type 'Yes' or 'No': ");
            doAgain = scan.nextLine(); // Update the variable
        }

        System.out.println("Calculator exited. Goodbye!");
        scan.close(); // Close the scanner to free resources
    }
}
