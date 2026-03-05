package pr3.delivery.model;

public class Truck extends Vehicle{
	private double maxLoad;

	public Truck(String model, double baseCost, Engine engine, double maxLoad) {
		super(model, baseCost, engine);
		this.maxLoad = maxLoad;
	}
	
	public double getMaxLoad() {
		return maxLoad;
	}
	
	@Override
	public double calculateDeliveryCost() {
		return super.calculateDeliveryCost() + maxLoad * 500;
	}
	
//	overload
	public double calculateDeliveryCost(double distance, double fuelPrice) {
		return calculateDeliveryCost() + distance * 300 + fuelPrice * 500;
	}
}
