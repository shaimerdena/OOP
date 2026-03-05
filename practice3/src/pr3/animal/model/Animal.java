package pr3.animal.model;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public abstract void makeSound();
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void eat(String food) {
		System.out.println("Eating " + food + "...");
	}
	
	@Override
	public String toString() {
		return "name: " + getName() + "\n" +
				"age: " + getAge() + "\n";			
	}
	
	public void getInfo() {
		System.out.println(this);
	}
}
