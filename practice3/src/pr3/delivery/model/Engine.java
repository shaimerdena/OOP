package pr3.delivery.model;

public class Engine {
	private String type;
	private int horsepower;
	
	public Engine(String type, int horsepower) {
		this.type = type;
		this.horsepower = horsepower;
	}

	public String getType() {
		return type;
	}

	public int getHorsepower() {
		return horsepower;
	}
	
	@Override
	public String toString() {
		return "type: " + getType() + "\n" +
				"horsepower: " + getHorsepower() + "\n";
	}
	
	public void getEngineInfo() {
		System.out.println(this);
	}
}
