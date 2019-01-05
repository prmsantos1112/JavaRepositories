package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.OrderPedido;
import entities.Products;
import entities.enums.OrderStatusEnum;

public class ProgramOrderPedido {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);	
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatusEnum status = OrderStatusEnum.valueOf(sc.next());
		
		OrderPedido pedido = new OrderPedido(new Date(), status, client);
		
		
		System.out.print("How many items to this order? ");
		int numero = sc.nextInt();
		for (int i = 1; i <= numero; i ++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
		
			Products produto = new Products(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();			
						
			OrderItem orderItem = new OrderItem(quantity, productPrice, produto);
			pedido.addItem(orderItem);
			
			
		}	
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(pedido);			

		sc.close();
	}

}
