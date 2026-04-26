package problem1.app;

import problem1.model.CreditCard;
import problem1.model.Cash;
import problem1.model.Payable;
import problem1.services.PaymentService;

public class PaymentApp {

	public static void main(String[] args) {
		Payable cc = new CreditCard();
		Payable c = new Cash();
		PaymentService ps = new PaymentService();
		ps.processPayment(c);
		ps.processPayment(cc);
	}

}
