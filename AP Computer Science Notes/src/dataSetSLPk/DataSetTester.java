package dataSetSLPk;

public class DataSetTester {

	public static void main (String[] args) {
		
		DataSet d = new DataSet(2, 11);
		d.addValue(10);
		d.addValue(13);
		d.addValue(4);
		d.addValue(-15);
		
		System.out.println("Largest: " + d.getLargest());
		System.out.println("EXPECTED: " + 13);
		System.out.println("Smallest: " + d.getSmallest());
		System.out.println("EXPECTED: " + -15);
		
	}
	
}
