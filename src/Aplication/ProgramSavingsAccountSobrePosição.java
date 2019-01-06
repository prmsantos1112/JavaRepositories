package Aplication;

import entities.Account;
import entities.BusinessAccountSobrePosicao;
import entities.SavingsAccountSobrePosicao;

public class ProgramSavingsAccountSobrePosição {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Paulo Ricardo", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccountSobrePosicao(1002, "Ricardo Augusto", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccountSobrePosicao(1003, "Paulo Eduardo", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
