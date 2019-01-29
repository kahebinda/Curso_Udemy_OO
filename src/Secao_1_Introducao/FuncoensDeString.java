package Secao_1_Introducao;

public class FuncoensDeString {

	public static void main(String[] args) {
		
		// Funcõnes para formatar uma string: toLowerCase(), toUpperCase(),trim()(remover espaços)
		// Funcoens para Recortar: substring(inicio), substring(inicio,fim)
		// Funcoesn para subistituir: Replace(char,char), Replace(string,string)
		// Buscar: IndexOf,LastindexOf
		// str.split("")
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2,9);
		String s6 = original.replace('a', 'x');
		String s7 = original.replace("abc","xy");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		String s = "potatp apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		
		
		System.out.println("Originla: -" + original+ "-");
		System.out.println("toLowerCase: -" + s1+ "-");
		System.out.println("toUpperCase: -" + s2+ "-");		
		System.out.println("Trim: -" + s3+ "-");		
		System.out.println("substring(2): -" + s4+ "-");		
		System.out.println("substring(2,9): -" + s5+ "-");	
		System.out.println("replace('a', 'x'): -" + s6+ "-");	
		System.out.println("replace('abc', 'xy'): -" + s7+ "-");
		System.out.println("indexOf(bc): -" + i + "-");
		System.out.println("lastIndexOf(bc): -" + j + "-");
	
		System.out.println(s);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	
	
	
	}

}
