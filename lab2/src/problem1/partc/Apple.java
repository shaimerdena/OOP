package problem1.partc;

import java.util.Objects;

public class Apple extends Fruit {
	private boolean hasWorm;
	
	public Apple(String name, String color, double cost, boolean hasWorm) {
		super(name, color, cost);
		this.setHasWorm(hasWorm);
	}

	public boolean isHasWorm() {
		return hasWorm;
	}

	public void setHasWorm(boolean hasWorm) {
		this.hasWorm = hasWorm;
	}

	@Override
	public String toString() {
		return super.toString() + "worm: " + this.isHasWorm() + "\n";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Apple)) return false;
		if(!(super.equals(o))) return false;
		Apple a = (Apple) o;
		return this.isHasWorm() == a.isHasWorm();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), hasWorm);
	}
}
