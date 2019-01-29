package Secao_2_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

import Secao_2_OO.Product;

public class MainTeste_Product {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity: ");
		produto.quantity = sc.nextInt();
		
		System.out.println(produto.toString());
		
		System.out.printf("Enter the number of products to be added in stock: ");
		produto.AddProducts(sc.nextInt());
		
		System.out.println(produto.toString());
		
		
		System.out.printf("Enter the number of products to be removed from stock: ");
		produto.RemoveProducts(sc.nextInt());
		System.out.println(produto.toString());
		
		
		
		sc.close();
		
	}

}
