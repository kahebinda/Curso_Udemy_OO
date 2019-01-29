package Secao_3_exercicios;

import java.util.Locale;
import java.util.Scanner;

import Secao_3_00.Product;

public class Main_Product{


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		Product p = new Product(name, price);
		
		System.out.println(p.toString());
		
		
		System.out.printf("Enter the number of products to be added in stock: ");
		p.AddProducts(sc.nextInt());
		
		System.out.println(p.toString());
		
		
		System.out.printf("Enter the number of products to be removed from stock: ");
		p.RemoveProducts(sc.nextInt());
		System.out.println(p.toString());
		
		
		
		sc.close();
		
	}

}