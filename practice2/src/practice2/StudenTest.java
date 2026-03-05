package practice2;

public class StudenTest {
	public static void main(String args[]) {
		Student s1;
		s1 = new Student("Ayau", 2, 4.00);

		Student s2;
		s2 = new Student("Aisha", 2, 4.00);

		s1.getInfo();
		s1.incrementYear();
		s1.getInfo();
		s2.getInfo();
	}
}