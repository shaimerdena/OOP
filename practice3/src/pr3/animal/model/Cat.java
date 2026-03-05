package pr3.animal.model;

public class Cat extends Animal {
	private String breed;

	public Cat(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println("Mew!");
	}

	public String getBreed() {
		return breed;
	}
}
