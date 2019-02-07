package Exercicio_Fixacao_Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		String name;
		String email;
		Date date;
		String status;
		int cont;
		
		
		
		System.out.println("Enter cliente data ");
		System.out.print("Name: ");
		name = sc.next();
		sc.nextLine();
		System.out.print("Email: ");
		email = sc.next();
		sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		date = sdf1.parse(sc.next());
		Client c = new Client(name, email, date);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		status = sc.next();
		Order order = new Order(new Date(),OrderStatus.valueOf(status) , c);
		
		System.out.print("How many items to this order? ");
		cont = sc.nextInt();
		
		for(int i=1;i<=cont;i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String pname = sc.next();
			System.out.print("Product price: ");
			double pprice = sc.nextDouble();			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			order.addItem(new OrderItem(quantity, pprice, new Product(pname, pprice)));
			
		}
		System.out.println(order);
		System.out.printf(" Total price: $%.2f",order.total());
		
		
		
		
		sc.close();
	}

}
