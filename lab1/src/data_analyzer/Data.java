package data_analyzer;

public class Data {
	private double max;
	private double sum;
	private int count;
	
	public Data() {
//		this.sum = 0;
//		this.count = 0;
		this.max = Double.NEGATIVE_INFINITY;
	}
	
	public void addValue(double number) {
		if(count == 0 || max < number) {
			max = number;
		}
		sum += number;
		count++;
	}
	
	public double getAverage() {
		if(count != 0) return sum/count;
		else return 0;
	}
	
	public double getMax() {
		if(count == 0) return 0;
		return max;
	}
	
	public void printStatistics() {
		System.out.println("Average = " + getAverage());
		System.out.println("Maximum = " + getMax());
	}
}
