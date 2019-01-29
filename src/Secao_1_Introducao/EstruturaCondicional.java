package Secao_1_Introducao;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero ");
		
		int n1 = sc.nextInt();
		if(n1 % 2 ==0) {
			System.out.printf("O numero %d é Par",n1);
		}else {
			System.out.printf("O numero %d é Impar",n1);
		}
		
		
		sc.close();
	}

}
