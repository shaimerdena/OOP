package problem2.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {

	@Override
	public void eatPizza() {
		System.out.println("Eating pizza...");
	}

	@Override
	public void retakeExam() {
		System.out.println("Retake the exam...");
	}

	@Override
	public void dance() {
		System.out.println("Dancing is what to do (to do)\n"
				+ "Dancing's when I think of you (of you)");
	}

	@Override
	public void move() {
		System.out.println("Moving...");
	}

}
