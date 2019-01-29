package Secao_1_Introducao_exercicios;

import java.util.Scanner;

public class ExercicioDeFixacao_04 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		boolean s = true;
		int maior=0;
		int n1;
		System.out.print("Enter N: "); 
		while(s != false) {
			int n = sc.nextInt();
			if(n > 0) {
				for(int i=0+1;i<=n;i++) {
					System.out.print("Value #"+i+": ");
					n1 = sc.nextInt();
					if(n1 > maior) {
						maior = n1;
					}if(i == n) {
						s = false;
						break;
					}	
				}
			}else {
				System.out.print("N must be positive! Try again: ");
			}
		}
		System.out.print("Maior = "+ maior);
		
	}
}
