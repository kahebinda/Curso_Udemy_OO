package Secao_2_OO_exercicios;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double convert(double price, double qtd) {
		return price * qtd * (1.0 + IOF);
		
	}
	
	
}
