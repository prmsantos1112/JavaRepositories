package Aplication;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int [][] matriz = new int [numero][numero];
		
		for ( int i = 0; i < matriz.length; i ++) {        // Alterar a variável (numero)->  por matriz.length;
			for (int j = 0; j < matriz[i].length; j ++) {  // Alterar a variável (numero)->  por matriz[i].length;
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal numbers: ");
		for (int i = 0; i < matriz.length; i ++) {
			System.out.print(matriz[i][i] + " ");
			
		}
		
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j ++) {
				if (matriz[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Negative Numbers: " + count);
		sc.close();
	}
}
