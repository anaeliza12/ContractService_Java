package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Double amount;
	private LocalDate dueDate;

	public Installments(Double amount, LocalDate date) {

		this.amount = amount;
		this.dueDate = date;
	}

	public LocalDate getDate() {
		return dueDate;
	}

	public Double getInstallments() {
		return amount;
	}

	@Override
	public String toString() {
		return dueDate.format(dtf) + " - " +String.format("%.2f", amount) ;
	}

}
