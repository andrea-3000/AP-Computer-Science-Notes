package dataSetPk;

public class Person implements Measurable { // what's missing???
	private int idNumber;
	private double salary;
	
	public Person(int idNumber, double salary){
		this.idNumber = idNumber;
		this.salary = salary;
	}
	
	public int getId(){
		return this.idNumber;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getMeasure() {
		return this.salary;
	}
}
