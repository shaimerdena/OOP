package problem3.model.device;

public class Iphone implements SellableAndPluggable{

	@Override
	public void selling() {
		System.out.println("Selling...");
	}

	@Override
	public void plugging() {
		System.out.println("Plugging...");
	}

}
