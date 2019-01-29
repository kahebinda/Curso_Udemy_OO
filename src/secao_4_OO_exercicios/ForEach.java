package secao_4_OO_exercicios;

public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i =0; i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------");
		for(String j : vect) {
			System.out.println(j);
		}
		
		
	}
	
}
