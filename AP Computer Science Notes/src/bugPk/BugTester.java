package bugPk;

public class BugTester {
	
	public static void main (String[] args) {
		
		Bug lady = new Bug(10);
		
		lady.move();
		lady.move();
		lady.move(); //position 13
		lady.turn();
		lady.move(); //position 12
		
		System.out.println(lady.getPosition());
		System.out.println("Expected: 12");
		
	}
}
