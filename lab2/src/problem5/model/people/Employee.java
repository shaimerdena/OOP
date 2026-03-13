package problem5.model.people;

import java.util.Objects;

public class Employee extends Person {
	private String position;

	public Employee(String name, int age, String position) {
		super(name, age);
		this.position = position;
	}

	@Override
	public String getOccupation() {
		return this.position;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if((o == null) || !(o instanceof Person)) return false;
		if(!(super.equals(o))) return false;
		Employee p = (Employee) o;
		return this.position == p.position;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.position);
	}
}
