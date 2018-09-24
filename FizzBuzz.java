import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println("Enter number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		fizzBuzz(number);
	}
	
	static void fizzBuzz (int number) {
		if (number > 0 && number < 200000) {
			for (int i = 1; i <= number; i++) {
	            if (i % 15 == 0) {
	                System.out.println("FizzBuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            } else {
	                System.out.println(String.valueOf(i));
	            }
	        }
		}
	}
}
