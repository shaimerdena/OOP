package problem5.model.animals;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public String makeSound() {
		return "Bark!";
	}

	@Override
	public String toString() {
		return "Dog, " + super.toString();
 	}
}
