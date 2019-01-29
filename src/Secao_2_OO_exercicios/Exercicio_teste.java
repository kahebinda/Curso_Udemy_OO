package Secao_2_OO_exercicios;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

import Secao_2_OO.Triangle;


public class Exercicio_teste {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangle x,y; 
		x = new Triangle();
		y = new Triangle();
		
		
		
		System.out.println("Enter the measures of triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double xarea = x.area();
		double yarea = y.area();
		
		
		
		if(xarea > yarea) {
			System.out.printf("triangule X area: %.4f%n ",xarea);
			System.out.printf("triangule Y area: %.4f%n ",yarea);
			System.out.println("Larger area: X");
		}else {
			System.out.printf("triangule X area: %.4f%n ",xarea);
			System.out.printf("triangule Y area: %.4f%n ",yarea);
			System.out.println("Larger area: Y");
		}
		
	}
	
	
}
