package Sessao_7_Enumeracao;

import java.util.Date;

import Enums.OrderStatus;

public class Order {

	private int ID;
	private Date moment;
	private OrderStatus status;
	
	public Order() {}

	public Order(int iD, Date moment, OrderStatus status) {
		super();
		ID = iD;
		this.moment = moment;
		this.status = status;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [ID=" + ID + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
	
}
