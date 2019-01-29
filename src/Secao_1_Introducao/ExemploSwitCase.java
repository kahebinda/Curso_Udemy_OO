package Secao_1_Introducao;

import java.util.Scanner;

public class ExemploSwitCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String day;

		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid Day";
		}
		System.out.println("Day: " + day);

		sc.close();
	}

}
