import java.util.Scanner;


public class BadForLoop {

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);	
		double x;
		double sum = 0;
		double count = 0;
		
		for(System.out.println("Inputs:"); (x = in.nextDouble()) > 0; sum += x) count++;
		
		System.out.println("Sum " + sum);
		System.out.println("Count is " + count);
		System.out.println("Average is " + sum/count);
		
	}
	
}
