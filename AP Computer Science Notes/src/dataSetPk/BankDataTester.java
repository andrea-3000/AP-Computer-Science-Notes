package dataSetPk;

public class BankDataTester {
	public static void main(String[] args) {
		DataSet d = new DataSet();
		
		BankAccount bank0 = new BankAccount(101.5);
		BankAccount bank1 = new BankAccount(2.5);
		BankAccount bank2 = new BankAccount(36.);
		BankAccount bank3 = new BankAccount(60.5);
		BankAccount bank4 = new BankAccount(220.5);
		
		d.add((Measurable)bank0);
		d.add((Measurable)bank1);
		d.add((Measurable)bank2);
		d.add((Measurable)bank3);
		d.add((Measurable)bank4);
		
		System.out.println("Should be 220.5 and is " + d.getMaximum());
		System.out.println("Should be 84.2 and is " + d.getAverage());
	}
	
}
