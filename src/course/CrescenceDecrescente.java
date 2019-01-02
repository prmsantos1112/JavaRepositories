package course;

import java.util.Scanner;

public class CrescenceDecrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x < y) {
				System.out.println("Numeração Crescente !!");
			} else {
				System.out.println("Numeração Decrescente !!");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
