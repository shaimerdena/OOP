package problem5.app;

import problem5.model.animals.Animal;
import problem5.model.animals.Cat;
import problem5.model.people.Employee;
import problem5.model.people.PhDStudent;
import problem5.model.registry.PersonRegistry;
import problem5.model.people.Person;

public class PetTest {

    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");

        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetWith(alice);

        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println(registry);
    }
}
