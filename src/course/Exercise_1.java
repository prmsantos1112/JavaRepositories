package course;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero_1 = sc.nextInt();
		int numero_2 = sc.nextInt();
		
		int soma_1_2 = numero_1 +  numero_2;
		
		System.out.println("A Soma é: " + soma_1_2);		
		
		sc.close();

	}

}
