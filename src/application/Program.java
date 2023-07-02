package application;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installments;
import services.ContractService;
import services.PayPal;
import services.PaymentService;

public class Program {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		PaymentService payPal = new PayPal();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Locale.setDefault(Locale.US);

		System.out.println("Enter with the contract datas: ");
		System.out.print("Number: ");
		Integer number = tec.nextInt();

		tec.nextLine();
		System.out.print("Date: ");
		LocalDate date = LocalDate.parse(tec.nextLine(), dtf);
	
	
		System.out.print("Contract value: ");
		Double value = tec.nextDouble();
		
		Contract contract = new Contract(number, date, value);

		System.out.print("Enter with the installments number: ");
		int installments = tec.nextInt();
		

		ContractService contractService = new ContractService(payPal);
		
		contractService.processContract(contract, installments);
		


		System.out.println("Installments:  ");

		for(Installments i : contract.getInstallments()) {
			System.out.println(i);
		}
	}

}
