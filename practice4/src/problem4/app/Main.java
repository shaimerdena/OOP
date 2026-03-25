package problem4.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import problem4.model.Student;
import problem4.model.NameComparator;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student("Cipher", 4.00);
		Student s2 = new Student("Bred", 3.70);
		Student s3 = new Student("Alec", 3.00);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println();
		
		Collections.sort(list, new NameComparator());
		
		for(Student s : list) {
			System.out.println(s);
		}
	}

}
