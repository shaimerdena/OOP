package pr3.delivery.model;

public class Car extends Vehicle{
	private int numberOfSeats;

	public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
		super(model, baseCost, engine);
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public double calculateDeliveryCost() {
		return super.getBaseCost() + getNumberOfSeats() * 100;
	}
	
//	overload
	public double calculateDeliveryCost(double extraWeight) {
		return calculateDeliveryCost() + extraWeight * 300;
	}
}
