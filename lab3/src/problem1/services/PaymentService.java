package problem1.services;

import problem1.model.Payable;

public class PaymentService {
	public void processPayment(Payable method) {
		method.pay();
	}
}
