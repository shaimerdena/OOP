package problem5.model.animals;

public class Bird extends Animal {

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public String makeSound() {
		return "Whistle";
	}
	
	@Override
	public String toString() {
		return "Bird, " + super.toString();
 	}

}
