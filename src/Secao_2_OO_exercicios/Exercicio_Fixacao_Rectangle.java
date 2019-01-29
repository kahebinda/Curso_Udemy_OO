package Secao_2_OO_exercicios;

public class Exercicio_Fixacao_Rectangle {

	public double width;
	public double height;
	
	
	
	public double area() {
		return width*height;
		
	}
	
	public double Perimeter() {
		return (2*width)+(2*height);}
	
	
	
	public double Diagonal() {
	
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	
	
}
}