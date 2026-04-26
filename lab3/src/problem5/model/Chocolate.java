package problem5.model;

public class Chocolate implements Comparable<Chocolate>{
	private double weight;
	private String name;
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "name - " + this.getName() + 
				" weight - " + this.getWeight();
	}

	@Override
	public int compareTo(Chocolate o) {
		if(this.getWeight() > o.getWeight()) return 1;
		else if(this.getWeight() < o.getWeight()) return -1;
		return 0;
	}
}
