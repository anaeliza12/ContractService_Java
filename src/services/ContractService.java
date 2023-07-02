package services;
import java.time.LocalDate;

import entities.Contract;
import entities.Installments;

public class ContractService {

	private PaymentService paymentService;

	public ContractService(PaymentService paymentService) {

		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getValue() / months;
		
		for (int i = 1; i <= months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i); 
			
			double interest = paymentService.interest(basicQuota, i);
			
			Double fee = paymentService.paymentFee( interest + basicQuota);
			
			Double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installments(quota, dueDate));
		}

	}
}
