package problem4.model;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	@Override
	public int compareTo(Student other) {
		return Double.compare(this.gpa, other.gpa);
	}
	
//	@Override
//	public int compareTo(Student other) {
//		if(this.getGPA() > other.getGPA()) {
//			return -1;
//		} else if(this.getGPA() < other.getGPA()) {
//			return 1;
//		}
//		return 0;
//	}
	
	@Override
	public String toString() {
		return this.getName() + " : " + this.getGPA();
	}
}
