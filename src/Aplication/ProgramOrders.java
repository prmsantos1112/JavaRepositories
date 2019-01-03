package Aplication;

import java.util.Date;

import entities.Orders;
import entities.enums.OrderStatus;

public class ProgramOrders {

	public static void main(String[] args) {
		
		Orders orders = new Orders(1080, new Date(), OrderStatus.PENDING_PAYMENT) ;

		System.out.println(orders);
		System.out.println();
		System.out.println();
		
		System.out.println("------ Conversão String para Enum ------");
		
		OrderStatus order_01 = OrderStatus.DELIVERED;
		System.out.println();
		OrderStatus order_02 = OrderStatus.valueOf("DELIVERED");		
		System.out.println(order_01);
		System.out.println();
		System.out.println(order_02);
	}

}
