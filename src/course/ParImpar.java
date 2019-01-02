package course;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Integer Number: ");

		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Number Even !!");
		}
		else {
		System.out.println("Number Odd !!");		
	    }
		sc.close();
     }
}