package secao_4_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

import sesao_4_classes.Estudante;

public class ExercicioDeFicacao01_Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Estudante[] estudantes = new Estudante[10];
		
		for(int i=0;i<n;i++){
			sc.nextLine();
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			estudantes[room] = new Estudante(name, email);
			System.out.println("");
		}
		
		for(int i=0;i<estudantes.length;i++) {
			if(estudantes[i]!=null) {
				System.out.println("Busy rooms:");
				System.out.printf("%d: %s, %s",i,estudantes[i].getNome(),estudantes[i].getEmail());
		}}
		
		
		sc.close();
	}
}
