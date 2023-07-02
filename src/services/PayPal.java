package services;

public class PayPal implements PaymentService {

	@Override
	public Double interest(Double amount, Integer month) {

		Double value = amount * 0.01 * month;
		return value;

	}

	@Override
	public Double paymentFee(Double amount) {
		Double value = amount * 0.02;
		return value;
	}

}
