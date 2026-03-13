package problem5.model.people;

import java.util.Objects;

import problem5.model.animals.Animal;
import problem5.model.animals.Dog;

public class PhDStudent extends Person {
	private String major;
	private String researchTopic;

	public PhDStudent(String name, int age, String major, String topic) {
		super(name, age);
		this.major = major;
		this.researchTopic = topic;
	}

	@Override
	public String getOccupation() {
		return major;
	}
	
	public void assignPet(Animal pet) {
		if(!(pet instanceof Dog)) {
			super.assignPet(pet);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if((o == null) || !(o instanceof Person)) return false;
		if(!(super.equals(o))) return false;
		PhDStudent p = (PhDStudent) o;
		return this.major.equals(p.major) &&
				this.researchTopic.equals(p.researchTopic);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.major, this.researchTopic);
	}

}
