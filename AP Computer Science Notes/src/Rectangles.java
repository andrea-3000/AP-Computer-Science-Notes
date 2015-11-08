import java.awt.Rectangle; //Rectangle is a class within the java.awt package


public class Rectangles {

	public static void main (String[] args) {
		
		Rectangle box1 = new Rectangle(5, 10, 15, 20);
		System.out.println("Box 1: ");
		System.out.println(box1);
		box1.translate(30,40);
		System.out.println(box1);
		
		Rectangle box2 = box1; //doesn't create a new Rectangle--just creates a new reference to the same memory address	
		
	}
	
}
