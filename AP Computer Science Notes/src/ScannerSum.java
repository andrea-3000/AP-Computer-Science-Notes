import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double sum = 0;
		double n = 0;
		
		while (n >= 0) {
			sum += n;
			System.out.println(sum);
			n = in.nextDouble();
		}
		
		System.out.println("The final sum is: " + sum);
	}
	
}
