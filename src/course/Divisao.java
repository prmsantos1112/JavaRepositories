package course;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("Sua Divisão torna-se Impossível !!");
			} else {
				double divisao = (double) a / b;
				System.out.printf("%.1f%n", divisao);

			}
		}

		sc.close();
	}

}
