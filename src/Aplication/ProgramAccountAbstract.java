package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.AccountAbstract;
import entities.BusinessAccountAbstract;
import entities.SavingsAccountAbstract;



public class ProgramAccountAbstract {

	public static void main(String[] args) {
		
		// Totalizar os saldos de todas as Contas;
		// Depositar 1000.00 em todas as Contas;
		
		Locale.setDefault(Locale.US);
		
		List<AccountAbstract> list = new ArrayList<>();
		
		list.add(new SavingsAccountAbstract(1001, "Paulo Ricardo", 5500.0, 0.10));
		list.add(new SavingsAccountAbstract(1002, "Ricardo Augusto", 3500.0, 0.10));
		list.add(new SavingsAccountAbstract(1003, "Paulo Eduardo", 2800.0, 0.10));
		list.add(new SavingsAccountAbstract(1004, "Evonira Santos", 5000.0, 0.10));
		list.add(new SavingsAccountAbstract(1005, "Yeslin Santos", 2500.0, 0.10));
		
		list.add(new BusinessAccountAbstract(2001, "Antonio Banderas", 10000.0, 500.0));
		list.add(new BusinessAccountAbstract(2002, "Jair Rodrigues", 15000.0, 500.0));
		list.add(new BusinessAccountAbstract(2003, "Homero Stanford", 8000.0, 500.0));
		list.add(new BusinessAccountAbstract(2004, "james Bond", 5000.0, 500.0));
		list.add(new BusinessAccountAbstract(2005, "Angelina Joly", 12000.0, 500.0));
		
		
		double sum = 0.0;
		for (AccountAbstract acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %2f%n" , sum);
		
		for (AccountAbstract acc : list) {
			acc.deposit(1000.0);
		}
		
		for (AccountAbstract acc: list) {
			System.out.printf("Updated Balanced for Account %d: %.2f%n ", acc.getNumber(), acc.getBalance());
		}

	}

}
