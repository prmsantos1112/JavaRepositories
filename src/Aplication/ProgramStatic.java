package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStatic {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius; ");
		double radius = sc.nextDouble();
		
		double  circunferencia = circumference(radius);
		double vol = volume(radius);
		
		System.out.printf("Circunference: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI volume: %.2f%n", PI);		
		
		sc.close();

	}
	
	public static double circumference (double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume (double radius) {
		return (4.0 * PI * radius * radius * radius) / 3.0;
	}

}
