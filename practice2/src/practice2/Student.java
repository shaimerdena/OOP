package practice2;

/*access modifiers:
 * 1. public - accessible everywhere
 * 2. private - only inside the class
 * 3. protected - only inside a class/a subclass
 * 4. package/default - data/method is accessible inside the package
 * */

/*fields should be set private
 * methods should be set public
 * */

public class Student {
	//fields
	private final String id;
	private final String name;
	private int year;
	private double gpa;

	//constructor
	public Student(String name, int year, double gpa) {
		this.name = name;
		this.year = year;
		this.gpa = gpa;
	}


	private static int studentCnt;

	{
		studentCnt++;
		this.id = "24B0" + studentCnt;
	}

	//methods
	//getters
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public int getYear() {
		return this.year;
	}
	public double getGPA() {
		return this.gpa;
	}
	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Year: " + year);
		System.out.println("GPA: " + gpa);
	}

	//setters
	public void setGPA(double newGPA) {
	    if(newGPA >= 0 && newGPA <= 4.0) {
	        this.gpa = newGPA;
	    } else {
	        System.out.println("Invalid GPA");
	    }
	}
	public void setYear(int newYear) {
		this.year = newYear;
	}

	public void incrementYear() {
		year++;
	}
}