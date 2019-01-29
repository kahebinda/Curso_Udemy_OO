package Secao_3_00;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int qtd) {
		this.name = name;
		this.price = price;
		this.quantity = qtd;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	
	
	
	
	
	
	public double TotalValuelnStock() {
		return price * quantity;
		
	
	}
	
	public void AddProducts(int quantity) {
		this.quantity  += quantity;
		
	}
	
	public void  RemoveProducts(int quantity) {
		this.quantity  -= quantity;
	}



	public String toString() {
		return "Product data: " 
				+ name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValuelnStock());
		

	}


}
