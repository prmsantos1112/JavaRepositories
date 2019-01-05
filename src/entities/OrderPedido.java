package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatusEnum;

public class OrderPedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatusEnum status;
	
	private Client cliente;
	private List<OrderItem> itens = new ArrayList<>();
	
	public OrderPedido(Date moment, OrderStatusEnum status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OrderStatusEnum status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItens() {
		return itens;
	}
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : itens) {
			sum += item.subTotal();
		}		
		return sum;
	}
	
	//    toString -  StringBuilder
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : itens) {
			sb.append(item + "\n");
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();

     }
}
