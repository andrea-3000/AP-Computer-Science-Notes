package dataSetCompPk;

public class DataSet {
	
	private Comparable maximum;
	private Comparable minimum;

	public DataSet() {
		Comparable maximum = null;
		Comparable minimum = null;
	}
	
	
	public Comparable getMaximum() {
		return this.maximum;
	}
	
	public Comparable getMinimum() {
		return this.minimum;
	}
	
	public void add(Comparable x) {
		
		if (this.maximum == null) {
			this.maximum = x;
		}
		
		if (this.minimum == null) {
			this.minimum = x;
		} else if (x.compareTo(this.maximum) > 0){
			this.maximum = x;
		} else if (x.compareTo(this.minimum) < 0) {
			this.minimum = x;
		}
	}
	
}
