package course;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i ++) {
			int produto = i * numero;
			System.out.println(i + " x " + numero + " = " + produto);
		}
		
		sc.close();
	}

}
