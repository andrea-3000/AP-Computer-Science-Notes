package vendingMachine;

public class VendingMachine {

	int tokenCount;
	int canCount;
	
	public VendingMachine(int cans) {
		tokenCount = 0;
		canCount = cans;
	}
	
	public void insertToken() {
		tokenCount++;
	}
	
	public void fillUp (int c) {
		canCount += c;
	}
	
	public int getCanCount() {
		return canCount;
	}
	
	public int getTokenCount() {
		return tokenCount;
	}
	
}
