package problem1.model;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();
}
