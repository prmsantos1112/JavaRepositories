package Aplication;

import java.util.Locale;
import java.util.Scanner;


public class ProgramCurrencyConverter {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Waht is the dollar price ? ");
		double qtdeDolar = sc.nextInt();
		
		System.out.println("How many dollars will be bought ? ");
		//double reais = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + qtdeDolar );		
		
		sc.close();

	}

}
