package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle rectangle = new Retangle();
		
		System.out.println("Enter rectangle Width and Height: ");		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.ValueArea());   
		System.out.printf("PERIMETER  = %.2f%n", rectangle.ValueParimeter());   
		System.out.printf("DIAGONAL  = %.2f%n", rectangle.ValueDiagonal());		
		
		sc.close();

	}

}
