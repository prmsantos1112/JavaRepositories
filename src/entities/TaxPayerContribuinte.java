package entities;

public abstract class TaxPayerContribuinte {

	private String nome;
	private Double anualIncome; // redimento anual;
	

	public TaxPayerContribuinte(String nome, Double anualIncome) {
		this.nome = nome;
		this.anualIncome = anualIncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();            // Imposto;
}


