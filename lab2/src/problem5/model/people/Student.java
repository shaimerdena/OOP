package problem5.model.people;

import java.util.Objects;

public class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public String getOccupation() {
		return this.major;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if((o == null) || !(o instanceof Person)) return false;
		if(!(super.equals(o))) return false;
		Student p = (Student) o;
		return this.major.equals(p.major);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.major);
	}
	
}
