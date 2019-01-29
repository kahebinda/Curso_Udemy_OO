package Secao_1_Introducao;

import java.util.Scanner;

public class ExercicioSequencial {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma hora");
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good morning");
		}else if(time >= 12 && time < 18) {
				System.out.println("Good Afternoon!");
			  }else {
				System.out.println("Good evening!");
			  }
		
	
	
		sc.close();
		
}
}
