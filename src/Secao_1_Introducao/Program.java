package Secao_1_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
		
		char	gender = 'F';
		int age = 32;
		double  balance = 10.35784;
		String name = "Maria";
		
		
		System.out.println("----------------");
		System.out.println("Good morning! ");
		System.out.println("Good Afternoon! ");
		System.out.println("good Night! ");
		System.out.println("----------------");
		
		
		System.out.printf("%.2f\n", balance);
		System.out.printf("%.4f\n", balance);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", balance);
	
		System.out.println("----------------");
		
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age, gender,balance);
		
		
		
	}

}
