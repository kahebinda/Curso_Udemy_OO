package Exercicio_Fixacao_Composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enums.OrderStatus;

public class Order {

	private Date momente;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderitem = new ArrayList<>();
	private static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
		// TODO Auto-generated constructor stub
	}


	public Order(Date momente, OrderStatus status,Client client) {
		this.momente = momente;
		this.status = status;
		this.client = client;
	}


	public Date getMomente() {
		return momente;
	}
	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public List<OrderItem> getOrderitem() {
		return orderitem;
	}


	public void addItem(OrderItem item) {
		orderitem.add(item);
		
	}
	
	public void removeItem(OrderItem item) {
		orderitem.remove(item);
	}
	
	public Client getClient() {
		return client;
	}


	public double total(){
		double soma = 0;
		for(OrderItem o : orderitem) {
			soma += o.subTotal();
		}
		return soma;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY "+"\n");
		sb.append("Order moment: " + sdf2.format(momente)+"\n");
		sb.append("Order status: " + getStatus()+"\n");
		sb.append("Cliente: " + getClient().getName() + getClient().getBirthDate() + getClient().getEmail()+"\n");
		sb.append("Order items: "+"\n");
		
		for(OrderItem o : orderitem){
			sb.append(o.getProduct().getName() + ", $" + o.getPrice()+ ", Quantity: " + o.getQuantity() + ", Subtotal: " + o.subTotal()+"\n");
		}
		
		return sb.toString();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
