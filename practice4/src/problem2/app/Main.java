package problem2.app;

import problem2.model.Cat;
import problem2.model.Restaurant;
import problem2.model.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		Cat cat = new Cat();
		Restaurant rest = new Restaurant();
		
		rest.servePizza(cat);
		rest.servePizza(student);
		
		student.dance();
	}
}
