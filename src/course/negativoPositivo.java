package course;

import java.util.Scanner;

public class negativoPositivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero < 0) {

			System.out.println("N�mero Negativo: " + numero);
		}
		else {
			System.out.println("N�mero Positivo: " + numero);
		}
		sc.close();
	}

}
