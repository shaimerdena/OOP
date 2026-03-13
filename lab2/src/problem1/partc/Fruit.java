package problem1.partc;

import java.util.Objects;

public abstract class Fruit {
	private String type;
	private String color;
	private double cost;
	
	public Fruit(String name, String color, double cost) {
		this.setColor(color);
		this.setCost(cost);
		this.setName(name);
	}

	public String getName() {
		return type;
	}

	public void setName(String name) {
		this.type = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "name: " + this.getName() + "\n" + 
				"color: " + this.getColor() + "\n" +
				"cost: " + this.getCost() + "\n";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof Fruit)) return false;
		Fruit f = (Fruit) o;
		return Objects.equals(this.type, f.type) &&
				Objects.equals(this.color, f.color) &&
				this.cost == f.cost;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(type, color, cost);
	}
}
