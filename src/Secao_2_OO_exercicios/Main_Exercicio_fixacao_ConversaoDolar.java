package Secao_2_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main_Exercicio_fixacao_ConversaoDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Wow many dollars will be bought? ");
		double qtd = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f ",CurrencyConverter.convert(dolar, qtd));
		
		sc.close();
	}

}
