package Secao_3_exercicios;

import java.util.Locale;
import java.util.Scanner;

import Secao_3_00.Conta;


public class Exercicio_Fixacao_ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter acconut number: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String s = sc.nextLine();
		
		
		
		System.out.print("Is there na initial deposit (y/n) ? : ");
		char c = sc.nextLine().charAt(0);
		
		if(c == 'y') {
			System.out.print("Enter initial deposit value: ");
			double v = sc.nextDouble();
			Conta c1 = new Conta(n,s,v);
			System.out.println("\n");
			c1.MostraDados();
			
			System.out.println("\n");
			System.out.print("Enter a deposit value: ");
			c1.Deposito(sc.nextDouble());
			System.out.println("Updated account data: ");
			c1.MostraDados();
			
			System.out.println("\n");
			System.out.print("Enter a withdraw value: ");
			c1.Saque(sc.nextDouble());
			System.out.println("Updated account data: ");
			c1.MostraDados();
			
			
		}else if (c == 'n') {
			Conta c2 = new Conta(n,s);
			c2.MostraDados();
			System.out.println("%n");
			System.out.print("Enter a deposit value: ");
			c2.Deposito(sc.nextDouble());
			System.out.println("\n");
			System.out.print("Enter a withdraw value: ");
			c2.Saque(sc.nextDouble());
			c2.MostraDados();
		} 
		
		
		
		
		
		
		
		sc.close();
	}

}
