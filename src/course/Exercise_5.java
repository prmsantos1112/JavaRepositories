package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//int peca_1 = sc.nextInt();
		int numeroPeca_1 = sc.nextInt();
		double valorUnitarioPeca_1 = sc.nextDouble();		
		
		//int peca_2 = sc.nextInt();
		int numeroPeca_2 = sc.nextInt();
		double valorUnitarioPeca_2 = sc.nextDouble();		
			
		double valorPagar = numeroPeca_1 * valorUnitarioPeca_1 + numeroPeca_2 * valorUnitarioPeca_2;
		
		System.out.printf("Valor a Pagar: %.2f", valorPagar);
		
		sc.close();

	}

}
