package Secao_2_OO_exercicios;

import java.util.Locale;
import java.util.Scanner;

import Secao_2_OO.Aluno;

public class Main_ecercicios_fixacao_Aluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		aluno.MediaFinal();
		
		
		
		
		sc.close();
	}
	
	
	
}
