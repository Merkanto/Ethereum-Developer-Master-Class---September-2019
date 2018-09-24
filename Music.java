import java.util.Scanner;

public class Music {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int l = scanner.nextInt();
	
		int factN = 1;
		int factNMinusK = 1;
		
		for(int i = 2; i <= n; i++) {
			factN *= i;
		}
		
		for(int i = 2; i <= n - k; i++) {
			factNMinusK *= i;
		}
		
		long output = (factN / factNMinusK) * (int)Math.pow(n, l - k);
				
		if (n - k <= 0) {
			System.out.println(0);
		}
		else {
			System.out.println(output);
		}
		
		
		
	}
}
