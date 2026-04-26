package problem1.model;

public class CreditCard implements Payable{

	@Override
	public void pay() {
		System.out.println("Paid by Credit card");
	}

}
