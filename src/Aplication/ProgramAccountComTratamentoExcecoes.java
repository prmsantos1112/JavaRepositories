package Aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AccountComTratamentoExcecoes;
import model.exceptions.DomainAccountException;

public class ProgramAccountComTratamentoExcecoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		AccountComTratamentoExcecoes accte = new AccountComTratamentoExcecoes(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for Withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			accte.withdraw(amount);
			System.out.print("New balance: " + String.format("%.2f", accte.getBalance()));
			
		} 
		catch (DomainAccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
			
		}				
		sc.close();
	}
}
