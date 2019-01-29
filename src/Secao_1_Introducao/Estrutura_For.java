package Secao_1_Introducao;

import java.util.Scanner;

public class Estrutura_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		for(int i=0; i<5; i++){
			soma = soma + (sc.nextInt());
			
		}
		System.out.println("A soma dos numeros é "+ soma);
	
	sc.close();
	}

}
