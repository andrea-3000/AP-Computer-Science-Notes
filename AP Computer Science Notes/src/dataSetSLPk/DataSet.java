package dataSetSLPk;

public class DataSet {
	
	private int largest;
	private int smallest;
	
	public DataSet(int a, int b) {
		
		if (a > b) {
			largest = a;
			smallest = b;
		} else if (a <= b) {
			largest = b;
			smallest = a;
		}
		
	}
	
	public void addValue(int x) {
		if (x >= largest) {
			largest = x;
		} else if (x <= smallest) {
			smallest = x;
		}
	}
	
	public int getLargest() {
		return largest;
	}
	
	public int getSmallest() {
		return smallest;
	}
}
