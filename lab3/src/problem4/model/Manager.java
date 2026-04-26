package problem4.model;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
	private Vector<Employee> team;
	private double bonus;

	public Manager(String name, double salary, String insuranceNumber, double bonus) {
		super(name, salary, insuranceNumber);
		this.team = new Vector<>();
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void addTeam(Employee e) {
		team.add(e);
	}
	
	public void getTeam() {
		for(Employee e : team) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", bonus: " + this.getBonus();
	}
	
	@Override 
	public boolean equals(Object other) {
		if(!super.equals(other)) return false;
		Manager m = (Manager) other;
		return Double.compare(this.getBonus(), m.getBonus()) == 0 &&
				Objects.equals(this.team, m.team);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.getBonus(), this.team);
	}
	
	@Override
	public int compareTo(Employee o) {
		int result = super.compareTo(o);
		if(result == 0 && (o instanceof Manager)) {
			Manager m = (Manager) o;
			return Double.compare(this.getBonus(), m.getBonus());
		}
		return result;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Manager cloned = (Manager) super.clone();
		
		cloned.team = new Vector<Employee>();
		for(Employee e: this.team) {
			cloned.addTeam(e);
		} 
		return cloned;
	}
}
