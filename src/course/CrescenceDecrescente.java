package course;

import java.util.Scanner;

public class CrescenceDecrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x < y) {
				System.out.println("Numera��o Crescente !!");
			} else {
				System.out.println("Numera��o Decrescente !!");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
