package pr3.delivery.model;

public abstract class Vehicle {
	private String model;
	private double baseCost;
	private Engine engine;
	
	public Vehicle(String model, double baseCost, Engine engine) {
		this.model = model;
		this.setBaseCost(baseCost);
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
	
	public double calculateDeliveryCost() {
		return baseCost;
	}
	
	
	@Override
	public String toString() {
		return "model: " + getModel() + "\n" +
				"base cost: " + getBaseCost() + "\n" +
				"engine: " + engine.getType() + "\n" +
				"horsepower of engine: " + engine.getHorsepower() + "\n";
	}
	
	public void getVehicleInfo() {
		System.out.println(this);
	}
}
