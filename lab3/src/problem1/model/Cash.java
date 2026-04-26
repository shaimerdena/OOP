package problem1.model;

public class Cash implements Payable{

	@Override
	public void pay() {
		System.out.println("Paid by Cash");
	}

}
