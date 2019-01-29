package secao_4_OO_exercicios;

public class Boxing_E_Unboxing {

	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int)obj;
		
		System.out.println(y);
	}
	
}
