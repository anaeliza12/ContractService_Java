package entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer numero;
	private LocalDate date;
	private Double value;

	private List<Installments> installments = new ArrayList<>();

	public Contract(Integer numero, LocalDate date, Double value) {
		this.numero = numero;
		this.date = date;
		this.value = value;

	}

	public Integer getNumero() {
		return numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getValue() {
		return value;
	}

	public List<Installments> getInstallments() {
		return installments;
	}

	@Override
	public String toString() {
		return "Contract [numero=" + numero + ", date=" + date + ", value=" + value + "]";
	}

}
