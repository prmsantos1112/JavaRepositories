package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class ProgramContaCorrente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ContaCorrente contaCorrente;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n) ?: ");
        char response = sc.next().charAt(0);
        
        if (response == 'y') {
        	System.out.print("Enter initial deposit value: ");
        	double initialDeposit = sc.nextDouble();
        	contaCorrente = new ContaCorrente (number, holder, initialDeposit);
        } 
        else {
        	contaCorrente = new ContaCorrente(number, holder);
        }        
        
        System.out.println();        
        System.out.println("Account Data: ");
        System.out.println(contaCorrente);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        contaCorrente.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(contaCorrente);
        
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        contaCorrente.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(contaCorrente);
        
        
        sc.close();
		
	}

}
