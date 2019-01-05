package Aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccountUpcastingDowncasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Paulo Ricardo", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Evonira Santos", 0.0, 500.0);
		
		// Upcasting; Atribuir(Converter) Objeto da SubClasse para a SuperClasse;
		
		Account acc1 = bacc;                             // Conta Empresarial é uma Conta: (É um);
		Account acc2 = new BusinessAccount(1003, "Ricardo Augusto", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Paulo Eduardo", 0.0, 0.01);
		
		// Downcasting: Atribuir(Converter) Objeto da SuperClasse para a SubClasse;
		
		BusinessAccount acc4 = (BusinessAccount)acc2;    // Deverá ser colocado o tipo entre parênteses;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; // acc3 é uma SavingsAccount e não uma BusinessAccount - O erro ocorrerá somente na Compilação;
                                                         // Não pode ser converido para BusinessAccount.
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan ! Empréstimo;");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update !");
		}
	}

}
