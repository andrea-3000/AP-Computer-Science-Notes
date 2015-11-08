package vendingMachine;

public class VendingMachineTester {

	public static void main (String[] args) {
		VendingMachine machine = new VendingMachine(0);
		machine.fillUp(10);
		machine.insertToken();
		machine.insertToken();
		System.out.print("Token count: ");
		System.out.println(machine.getTokenCount());
		System.out.println("Expected: 2");
		System.out.println("Can count: ");
		System.out.print(machine.getCanCount());
		System.out.println("Expected: 8");
		
	}
	
}
