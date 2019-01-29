package Secao_1_Introducao_exercicios;

import java.util.Scanner;

public class ExercicioDeFixacao_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite 3 numeros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		
		int maior = 0;
		
		if(n1 > maior){
			maior = n1;
			if( n2 > maior){
				maior = n2;
			if( n3 > maior){
					maior = n3;
				}
		}}
		System.out.printf("O maior numero encontrado foi %d ", maior);
		
		
		
		sc.close();
	}
	
	
}
