package secao_4_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double s=0;
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			s += vect[i];
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(vect[i]);
		}
		System.out.printf("AVERAGE HEIGHT = %.2f", s/n);
		
		
		
		
		
		sc.close();
		
	} 
	
	
}
