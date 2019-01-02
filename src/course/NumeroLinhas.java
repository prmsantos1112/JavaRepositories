package course;

import java.util.Scanner;

public class NumeroLinhas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();		

		for (int i = 1; i <= numero; i ++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;

			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

		}		

		sc.close();
	}
}
