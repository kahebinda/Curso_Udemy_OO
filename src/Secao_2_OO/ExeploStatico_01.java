package Secao_2_OO;

import java.util.Locale;
import java.util.Scanner;

import Secao_1_Introducao.ExemploSwitCase;

public class ExeploStatico_01 {

	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = ExeploStatico_Calculator.circumference(radius);
		
		double v = ExeploStatico_Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n",ExeploStatico_Calculator.PI);
		
		
		sc.close();
	}

	
	
	
}
