package entities;

public class SavingsAccountAbstract extends AccountAbstract {
	
	private Double instrestRate;      // Taxa de Juros;
	
	public SavingsAccountAbstract() {
		super();
	}

	public SavingsAccountAbstract(Integer number, String holder, Double balance, Double instrestRate) {
		super(number, holder, balance);
		this.instrestRate = instrestRate;
	}

	public Double getInstrestRate() {
		return instrestRate;
	}

	public void setInstrestRate(Double instrestRate) {
		this.instrestRate = instrestRate;
	}
	
	// Método: Atualiza Saldo com Taxa de Juros;
	
	public void updateBalance() {
		balance += balance * instrestRate;
	}
	
	
}
