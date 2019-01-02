package entities;

public class ContaCorrente {

	private int numberAccount;
	private String holder;	
	private double balance;	
	
	public ContaCorrente(int numberAccount, String holder) {		
		this.numberAccount = numberAccount;
		this.holder = holder;
	}	

	public ContaCorrente(int numberAccount, String holder, double initialDeposit) {		
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "ContaCorrente "
				+ numberAccount
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
