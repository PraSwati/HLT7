import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Enter first number: ");
		num1= s.nextInt();
		
		System.out.println("Enter second number: ");
		num2= s.nextInt();
		
		System.out.println("Sum of both the numbers is: " +(num1+num2) );
	}
}
