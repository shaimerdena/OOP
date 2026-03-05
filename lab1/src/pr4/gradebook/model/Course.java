package pr4.gradebook.model;

public class Course {
	private String name;
	private String description;
	private int credits;
	private int prerequisites;
	
	public Course(String name, String description, int credits, int prerequisites) {
		this.name = name;
		this.setDescription(description);
		this.setCredits(credits);
		this.setPrerequisites(prerequisites);
	}
	
	

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(int prerequisites) {
		this.prerequisites = prerequisites;
	}
	
	
}
