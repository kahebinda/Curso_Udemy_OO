package secao_4_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_2_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		System.out.println("\n");
		int n = sc.nextInt();
		
		Produto[] p = new Produto[n]; 
		
		double media = 0;
		for(int i=0;i<p.length;i++){
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.print("Digite o preco do produto: ");
			double preco = sc.nextDouble();
			p[i] = new Produto(name,preco);
			media += p[i].getPreco();
			System.out.println("");
		}
		
		System.out.printf("A media é %.2f ",media/p.length);
		sc.close();
	}

}
