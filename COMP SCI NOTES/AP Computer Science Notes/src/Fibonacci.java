import java.util.Scanner;


public class Fibonacci {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.println("fib(" + n + "): " + getFibIterate(7));
	}
	
	public static long getFibIterate (int n) {
		int[] fibs = new int[n];
		
		fibs[0] = 1;
		fibs[1] = 1;
		
		for (int i = 2; i < fibs.length; i++) {
			fibs[i] = fibs[i-1] + fibs[i-2];
		}
		
		return fibs[n-1];
	}
	
	public static long getFibRecurse (int n) {
		if (n <= 2) return 1;
		
		return getFibRecurse(n-1) + getFibRecurse(n-2);
	}
}