package problem5.model.animals;

public class Fish extends Animal {

	public Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public String makeSound() {
		return "blub";
	}

	@Override
	public String toString() {
		return "Fish, " + super.toString();
 	}
}
