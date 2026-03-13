package problem5.model.animals;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public String makeSound() {
		return "Meow";
	}
	
	@Override
	public String toString() {
		return "Cat, " + super.toString();
 	}
}
