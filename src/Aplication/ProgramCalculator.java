package Aplication;

import java.util.Locale;
import java.util.Scanner;

import utilityes.Calculator;

public class ProgramCalculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius; ");
		double radius = sc.nextDouble();
		
		double  circunferencia = calc.circumference(radius);
		double vol = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI volume: %.2f%n", calc.PI);		
		
		sc.close();

	}

}
