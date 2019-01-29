package secao_4_OO_exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sesao_4_classes.Funcionario;

public class ExercicioDeFixacao_02_Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println("");
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Employee #"+(i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			System.out.println("");
			funcionarios.add(new Funcionario(id, name, salario));
			
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		
		
		Funcionario emp = funcionarios.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("this id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			emp.mudaSalario(porcentagem);
		}
		
		
		
		//for(Funcionario f : funcionarios) {
		//	if(f.getId() == id) {
		//		f.mudaSalario(f.getSalaty(), porcentagem);
		//	}else {
		//		System.out.println("This id does not exist! ");
		//	}
	//	}
		
		for(Funcionario f : funcionarios) {
			System.out.println("List of employees");
			System.out.println(f.getId()+", " + f.getName()+", " + f.getSalaty());
		}
		
		
		
		
		
		sc.close();
	}
}
