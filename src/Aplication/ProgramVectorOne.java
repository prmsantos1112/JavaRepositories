package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.VectorOne;

public class ProgramVectorOne {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		VectorOne[] vector = new VectorOne[numero];

		for (int i = 0; i < vector.length; i++) {   // Alterar variável (numero) por vector.length 
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vector[i] = new VectorOne(name, price);

		}
		
		double soma = 0.0;
		for (int i = 0; i < vector.length; i ++) {   // Alterar variável (numero) por vector.length
			soma += vector[i].getPrice();
			
		}
		
		double avg = (soma / vector.length);
		
		System.out.printf("Average Price: %.2f%n", avg);    // Alterar variável (numero) por vector.length
		
		sc.close();

	}

}
