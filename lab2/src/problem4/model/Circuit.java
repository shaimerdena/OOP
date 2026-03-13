package problem4.model;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return Math.pow(this.getPotentialDiff(),2) / this.getResistance();
	}
	public double getCurrent() {
		return this.getPotentialDiff() / this.getResistance();
	}
	
	public String toString() {
		return "Voltage: " + this.getPotentialDiff() + "\n" +
				"Resistance: " + this.getResistance() + "\n" + 
				"Current: " + this.getCurrent() + "\n" +
				"Power: " + this.getPower() + "\n";
	}
}
