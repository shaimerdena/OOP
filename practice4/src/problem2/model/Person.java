package problem2.model;

public abstract class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}
}
