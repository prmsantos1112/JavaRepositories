package course;

import java.util.Locale;
import java.util.Scanner;

public class CasoTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
				
		for (int i = 0; i < numero; i ++) {
			
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();		
		
		double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		
			System.out.printf("%.1f%n", media);
		}	
		sc.close();
	}
}
