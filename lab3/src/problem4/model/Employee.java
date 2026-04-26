package problem4.model;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name, double salary, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.insuranceNumber = insuranceNumber;
		this.hireDate = new Date();
	}
	
	public double getSalary() {
		return salary;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"insuranceNumber: " + this.insuranceNumber + ", ";
	}
	
	@Override
	public boolean equals(Object other) {
		if(this == other) return true;
		if(other == null || !(other instanceof Employee)) return false;
		Employee e = (Employee) other;
		return e.getName().equals(this.getName()) &&
				e.getInsuranceNumber().equals(this.getInsuranceNumber()) &&
				e.getHireDate().equals(this.getHireDate()) &&
				Double.compare(this.getSalary(), e.getSalary()) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getName(), this.getSalary(), this.getInsuranceNumber(), this.getHireDate());
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getSalary() > o.getSalary()) return 1;
		if(this.getSalary() < o.getSalary()) return -1;
		return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException  {
		Employee cloned = (Employee) super.clone();
		cloned.hireDate = (Date) this.getHireDate().clone();
		return cloned;
	}
}
