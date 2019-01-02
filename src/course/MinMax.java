package course;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min,max;
		
		if ( x < y ) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		
		for (int i= min+1; i < max; i ++) {
			if ( i % 2 != 0) {
				soma = soma + 1;
			}
		}
		System.out.println("A soma é: " + soma);
		sc.close();

	}
}
