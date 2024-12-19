package JavaBasic;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Fibonacci Number: ");
		int num = scan.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i=0;i<num;i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a+b;
			
		}
	}

}
