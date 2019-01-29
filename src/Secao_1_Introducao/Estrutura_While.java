package Secao_1_Introducao;

import java.util.Scanner;

public class Estrutura_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero ");
		int n = sc.nextInt();
		
		
		while(n >= 0){
			System.out.printf("%.3f%n",Math.sqrt(n));
			System.out.println("Digite outro numero: " );
			n = sc.nextInt();
	}
		System.out.println("Numero negativo");
		sc.close();	
}}
