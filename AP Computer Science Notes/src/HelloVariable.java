
public class HelloVariable 
{
	public static void main (String[] args) 
	{
		String hello = "Hello!";
		String more;
		more = hello.toUpperCase();
		System.out.println(hello);
		System.out.println(more);
		System.out.println(hello.length());
		
		hello = hello.replace("H", "Y"); //the replace function does NOT reassign the string value
		System.out.println(hello);
	}
}
