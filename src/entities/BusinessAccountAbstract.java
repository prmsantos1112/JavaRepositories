package entities;

public class BusinessAccountAbstract extends AccountAbstract {
	
	private Double loanLimit;

	public BusinessAccountAbstract() {
		super();
	}

	public BusinessAccountAbstract(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
		
	}
	
}


