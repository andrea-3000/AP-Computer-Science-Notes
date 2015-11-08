import java.awt.Rectangle;


public class Square extends Rectangle{
	
	public Square(int x, int y, int s) {
		
		super(x-(s/2), y-(s/2), s, s);
	}
	
	public int getArea() {
		
		return this.height*this.height;
		
	}
	
}
