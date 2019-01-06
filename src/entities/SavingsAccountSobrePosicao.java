package entities;

public class SavingsAccountSobrePosicao extends Account{
	
	private Double instrestRate;      // Taxa de Juros;
	
	public SavingsAccountSobrePosicao() {
		super();
	}

	public SavingsAccountSobrePosicao(Integer number, String holder, Double balance, Double instrestRate) {
		super(number, holder, balance);
		this.instrestRate = instrestRate;
	}

	public Double getInstrestRate() {
		return instrestRate;
	}

	public void setInstrestRate(Double instrestRate) {
		this.instrestRate = instrestRate;
	}
	
	// M�todo: Atualiza Saldo com Taxa de Juros;
	
	public void updateBalance() {
		balance += balance * instrestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
		
	}
}

