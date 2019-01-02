package Aplication;

import java.util.Locale;
import java.util.Scanner;

import utilityes.CalculatorStatic;

public class ProgramCalculatorStatic {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius; ");
		
		double radius = sc.nextDouble();		
		double  circunferencia = CalculatorStatic.circumference(radius);
		double vol = CalculatorStatic.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI volume: %.2f%n", CalculatorStatic.PI);		
		
		sc.close();

	}

}
