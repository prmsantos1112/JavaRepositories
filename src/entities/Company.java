package entities;

public class Company extends TaxPayerContribuinte {	
	
	private Integer numberOfEmployees;		

	public Company(String nome, Double anualIncome, Integer numberOfEmployees) {
		super(nome, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
				
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
		
	}

	@Override	
		public Double tax() {			
			if (numberOfEmployees > 10) {
				return getAnualIncome() * 14 / 100; 
				
			}
			else {	
				
			    return getAnualIncome() * 16 / 100;
					   
			}
	}	

}
