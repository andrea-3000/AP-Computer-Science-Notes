
public class HollePrinter 
{
	
	public static void main (String[] args) 
	{
		
		String hello = "Hello World!";
		System.out.println("Original String: " + hello);
		
		hello = hello.replace("e", "a");
		System.out.println("Switching e to arbitrary letter: " + hello);
		
		hello = hello.replace("o", "e");
		System.out.println("Switching o's to e's: " + hello);
		
		hello = hello.replace("a", "o");
		System.out.println("Switching arbitrary letter(s) to o's: " + hello);
		
	}
	
}
