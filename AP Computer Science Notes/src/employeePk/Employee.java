package employeePk;

/**
 * An employee with a name and salary
 * @author Andrea Gonzales
 *
 */

public class Employee {

	public String name;
	public double salary;
	
	/**
	 * 
	 * @param employeeName the employee name
	 * @param currentSalary the employee salary
	 */
	public Employee(String employeeName, double currentSalary) {
		
		name = employeeName;
		salary = currentSalary;
		
	}
	
	/**
	 * Get the employee name
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Get the employee salary
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
	
	/**
	 * Raises the salary by a given percentage
	 * @param percent the percentage of the raise
	 */
	public void raiseSalary(double percent) {
		salary = salary*(1 + percent/100);
	}
	
}