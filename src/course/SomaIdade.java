package course;

import java.util.Locale;
import java.util.Scanner;

public class SomaIdade {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int contagem = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			contagem = contagem + 1;
			idade = sc.nextInt();
		}
		
		if ( contagem > 0) {
			double media = (double) soma / contagem;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Impossível Realizar o Cálculo !!");
		}
		
		sc.close();
	}
}
