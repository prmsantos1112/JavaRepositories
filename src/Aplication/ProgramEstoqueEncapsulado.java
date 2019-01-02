package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductEncapsulado;

public class ProgramEstoqueEncapsulado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Product p = new Product();		
			
		System.out.println("Enter Product Data; ");
		System.out.println("Name; ");
		String name = sc.nextLine();
		System.out.print("Price; ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock; ");
		// int quantity = sc.nextInt();	
		
		ProductEncapsulado product = new ProductEncapsulado(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		/*  A quantidade deverá ser atualizada através
		 *  da regra dp negócio: com os metodos da classe		 *  
		 */ //(productEncapsulado).//
		
		
		System.out.println();
		System.out.println("Product Data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of Products to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of Products to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product.toString());
		
		sc.close();

	}
}
