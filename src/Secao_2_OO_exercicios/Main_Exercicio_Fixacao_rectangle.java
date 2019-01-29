package Secao_2_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main_Exercicio_Fixacao_rectangle {

	public static void main(String[] agrs) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio_Fixacao_Rectangle retangulo = new Exercicio_Fixacao_Rectangle();
		
		System.out.println("Enter rectangle width and height");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		
		
		System.out.printf("AREA = %.2f \n",retangulo.area());
		
		System.out.printf("PERIMETER = %.2f \n",retangulo.Perimeter());
		
		System.out.printf("DIAGONAL = %.2f ",retangulo.Diagonal());
		
		
		sc.close();
		
	}
}
