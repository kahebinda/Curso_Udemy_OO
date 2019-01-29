package Secao_2_OO;

public class Aluno {

	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	
	public void MediaFinal() {
		double media = n1+n2+n3;
		if(media >= 60) {
			System.out.printf("FINAL GRADE = %.2f \n",media);
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f \n",media);
			System.out.println("FAILED \n");
			System.out.printf("MISSING %.2f POINTS",(60 - media));
		}
		
	}
	
	
}
