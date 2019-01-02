package course;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}	
		System.out.println("Seu Fatorial é: " + fatorial);
		
		sc.close();
	}
}
