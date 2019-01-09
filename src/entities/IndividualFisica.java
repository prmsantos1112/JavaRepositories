package entities;

public class IndividualFisica extends TaxPayerContribuinte {
	
	private Double healthexpendictures;			

	public IndividualFisica(String nome, Double anualIncome, Double healthexpendictures) {
		super(nome, anualIncome);
		this.healthexpendictures = healthexpendictures;
	}

	public Double getHealthexpendictures() {
		return healthexpendictures;
	}

	public void setHealthexpendictures(Double healthexpendictures) {
		this.healthexpendictures = healthexpendictures;
	}

	@Override
	public Double tax() {			
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 15 / 100 - healthexpendictures * 0.5;  	
			
		}
		else {	
			
		    return getAnualIncome() * 25 / 100 - healthexpendictures * 0.5;
				   
		}
	} 

}
