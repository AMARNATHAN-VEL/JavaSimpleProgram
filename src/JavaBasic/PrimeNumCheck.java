package JavaBasic;
import java.util.Scanner;

public class PrimeNumCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int input = scan.nextInt();

        
        if (input <= 1) {
            System.out.println("The Given Number " + input + " is Not a Prime Number.");
        } else {
            // Check for prime
            boolean isPrime = true;
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break; 
                }
            }

            
            if (isPrime) {
                System.out.println("The Given Number " + input + " is a Prime Number.");
            } else {
                System.out.println("The Given Number " + input + " is Not a Prime Number.");
            }
        }

        scan.close();
    }
}
