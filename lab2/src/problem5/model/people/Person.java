package problem5.model.people;

import java.util.Objects;

import problem5.model.animals.Animal;
import problem5.model.animals.Dog;

public abstract class Person {
	private String name;
	private int age;
	private Animal pet;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void assignPet(Animal pet) {
		this.pet = pet;
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		if(this.pet != null) {
			return true;
		} else return false;
	}
	
	public abstract String getOccupation();
	
	public void leavePetWith(Person other) {
		if(!(this.pet == null) || !other.hasPet() &&
				!(this.pet instanceof Dog && other instanceof PhDStudent)) {
			other.assignPet(pet);
			this.removePet();
		}
	}
	
	public void retrievePetFrom(Person other) {
		if(other.hasPet()) {
			this.assignPet(other.pet);
			other.removePet();
		}
	}
	
	@Override
	public String toString() {
		String petInfo = (this.pet == null) ? "No pet" : this.pet.toString();
		return "name: " + this.getName() + "\n" + 
				"age: " + this.getAge() + "\n" + 
				"occupation: " + this.getOccupation() + "\n" +
				"Pet: " + petInfo + "\n";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if((o == null) && !(o instanceof Person)) return false;
		Person p = (Person) o;
		return this.name.equals(p.name) &&
				this.age == p.age;
	}
	
	public int hashCode() {
		return Objects.hash(this.name, this.age);
	}
}
