package pr3.animal.app;

import java.util.ArrayList;

import pr3.animal.model.Animal;
import pr3.animal.model.Dog;

public class MainApp {
	public static void main(String[] args) {
		Animal dog1 = new Dog("Alpha", 7, "vostochno-evropeiskaya");
		Animal dog2 = new Dog("Betta", 10, "nemetskaya");
		Animal dog3 = new Dog("Gamma", 6, "unknown");
		
		ArrayList<Animal> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		
		for(Animal d: dogs) {
			d.getInfo();
		}
	}
}
