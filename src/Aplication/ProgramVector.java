package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		double[] vector = new double[numero];

		for (int i = 0; i < numero; i++) {
			vector[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < numero; i++) {
			soma += vector[i];
		}

		double avg = soma / numero;

		System.out.printf("Average Height: %.2f%n", avg);

		sc.close();

	}

}
