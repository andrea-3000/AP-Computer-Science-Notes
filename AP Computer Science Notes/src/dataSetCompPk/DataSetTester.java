package dataSetCompPk;

public class DataSetTester {

	public static void main(String[] args){
		DataSet stringData = new DataSet();
		stringData.add("Helen");
		stringData.add("Andy");
		stringData.add("Robert");
		stringData.add("Vicky");
		Comparable max = stringData.getMaximum();
		Comparable min = stringData.getMinimum();
		System.out.println("Maximum: " + max);
		System.out.println("Expected: Vicky");
		System.out.println("Minimum: " + min);
		System.out.println("Expected: Andy");
		DataSet intData = new DataSet();
		intData.add(7); // autoboxing
		intData.add(12);
		intData.add(193);
		intData.add(-34);
		max = intData.getMaximum();
		min = intData.getMinimum();
		System.out.println("Maximum: " + max);
		System.out.println("Expected: 193");
		System.out.println("Minimum: " + min);
		System.out.println("Expected: -34");
	}
}
