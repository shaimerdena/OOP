package problem5.model.registry;

import java.util.Vector;

import problem5.model.people.Person;

public class PersonRegistry {
	private Vector<Person> people;
	
	public PersonRegistry(){
		people = new Vector<>();
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public void peopleWithPets() {
		for(Person p : people) {
			if(p.hasPet()) {
				System.out.println(p);
			}
		}
	}
	
	public String iterateVector() {
		String info = "";
		for(Person p : people) {
			info += p.toString() + "\n";
		}
		return info;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if((o == null) || !(o instanceof Person)) return false;
		PersonRegistry p = (PersonRegistry) o;
		return this.people.equals(p.people);
	}
	
	@Override
	public String toString() {
		return this.iterateVector();
	}
}
