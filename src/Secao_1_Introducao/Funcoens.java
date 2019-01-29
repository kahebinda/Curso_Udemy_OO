package Secao_1_Introducao;

import java.util.Scanner;

public class Funcoens {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		int maior = max(a,b,c);
		
		showResult(maior);
		
		
		sc.close();
	}

	public static void showResult(int maior) {
		System.out.println(" O maior numero é "+ maior);
		
	}

	public static int max(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		}else if(b > a && b > c) {
			return b;
		}else {
			return c;
		}
		
	}

}
