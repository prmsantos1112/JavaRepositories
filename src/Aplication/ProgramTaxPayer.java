package Aplication;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.IndividualFisica;
import entities.TaxPayerContribuinte;

public class ProgramTaxPayer {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayerContribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of Tax Payers: ");		
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i ++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c)? ");			
			
			
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual Income: ");
			double income = sc.nextDouble();			
			
			
			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualFisica(name, income, healthExpenditures));			
			}
			else {			
			
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, income, numberOfEmployees));		
			
				System.out.println("");
			}
			
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for (TaxPayerContribuinte tpc : list) {
			double tax = tpc.tax();
			System.out.println(tpc.getNome() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();

	}
}


