package course;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
		System.out.println("Enter a Number : ");
	    
		double numero = sc.nextDouble();
	    double sq =  Math.sqrt(numero);
	    
	    System.out.printf("Square root = %.3f%n", sq);    
	    
		System.out.println("Repeat y/n ? ");
		resposta = sc.next().charAt(0);
		
		} while (resposta != 'n' );		
		
		sc.close();
	}

}
