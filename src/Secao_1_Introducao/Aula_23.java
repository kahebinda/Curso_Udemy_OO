package Secao_1_Introducao;

import java.util.Scanner;

public class Aula_23 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			
			int mask = 0b100000;
			int n = sc.nextInt();
			
			
			if ((n & mask) != 0) {
				System.out.println("6th bit is True!");
			}
			else {
				System.out.println("6th bit is False!");
			}
			
			
			
			sc.close();
	}

}
