package dataSetPk;

public class DataSet {
	private double sum;
	private Measurable maximum;
	private int count;

	public DataSet()
	{
		this.sum = 0;
		this.maximum = null;
		this.count = 0;
	}
	
	public void add(Measurable x){
		this.sum += x.getMeasure();
		if (this.count == 0 ||
				this.maximum.getMeasure() <
				x.getMeasure())
		{
			this.maximum = x;
		}
		this.count++;
	}
	public double getAverage(){
		if (this.count == 0) return 0;
		else return this.sum / this.count;
	}
	
	public Measurable getMaximum(){
		return this.maximum;
	}
}