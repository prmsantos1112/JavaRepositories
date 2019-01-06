package Aplication;

import entities.Account;
import entities.SavingsAccountSobrePosicao;

public class ProgramPolimorfismo {

	public static void main(String[] args) {
		
		/*               P O L I M O R F I S M O
		 * Vari�veis do mesmo tipo apontam para Objetos do tipo
		 * espec�ficos diferentes tendo comportamentos diferentes
		 * conforme cada tipo espec�fico; 
		 */
		
		     // Conta Comum e ContaPoupan�a - Conta Poupan�a n�o desconta taxa de saque;
		
		Account polimorf_1 = new Account(1020, "Paulo Ricardo", 1000.0);
		Account polimorf_2 = new SavingsAccountSobrePosicao(1023, "Maria", 1000.0, 0.01);
		
		     // Vari�veis com comportamentos diferentes;
		
		polimorf_1.withdraw(50.0); 
		polimorf_2.withdraw(50.0);
		
		     
		System.out.println(polimorf_1.getBalance());
		System.out.println(polimorf_2.getBalance());

	}

}
