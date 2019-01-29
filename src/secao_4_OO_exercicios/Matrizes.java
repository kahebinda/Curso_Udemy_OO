package secao_4_OO_exercicios;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int [][] m = new int[n][n];
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal");
		for(int i=0; i<m.length;i++) {
			System.out.print(m[i][i]+ " ");
		}
		
		System.out.println();
		
		int negativo =0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j] <0) {
					negativo+=1;
				}
			}
		}
		System.out.println("Negative numbes: " + negativo);
		
		
		
		sc.close();
	}

}
