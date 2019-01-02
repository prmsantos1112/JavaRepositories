package entities;

public class Student {

	public String name;
	public double primeiroTrimestreGrade_1;
	public double segundoTrimestreGrade_2;
	public double terceiroTrimestreGrade_3;

	public double finalGrade() {
		return primeiroTrimestreGrade_1 + segundoTrimestreGrade_2 + terceiroTrimestreGrade_3;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();

		} else {
			return 0.0;
		}
	}
}
