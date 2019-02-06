package Sessao_8_Composicao;

import java.util.Locale;
import java.util.Scanner;

import Enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		String departamento;
		String workerName;
		String workerLevel;
		double workerSalary;
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do departamento");
		departamento = sc.nextLine();
		
		System.out.print(" Enter com os dados do trabalhador");
		System.out.print("Name: ");
		workerName = sc.nextLine();
		
		System.out.print("Level: ");
		workerLevel = sc.nextLine();
		
		System.out.print("Salary: ");
		workerSalary = sc.nextDouble();
		
		
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departamento));
		
		System.out.println();
		
		
		sc.close();
	}

}
