package entities;

public class OutSourcedEmployeesPolimorfismo extends EmployeesPolimorfismo {
	
	private double additionalCharge;
	
	public OutSourcedEmployeesPolimorfismo() {
		super();
	}

	public OutSourcedEmployeesPolimorfismo(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	 
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
