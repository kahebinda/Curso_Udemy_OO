package sesao_4_classes;

public class Funcionario {

	private int Id;
	private String name;
	private double salaty;
	
	
	public Funcionario(int id, String name, double salaty) {
		super();
		Id = id;
		this.name = name;
		setSalaty(salaty);
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalaty() {
		return salaty;
	}


	public void setSalaty(double salaty) {
		this.salaty = salaty;
	}
	
	public void mudaSalario(double porcentagem) {
		this.salaty += this.salaty*porcentagem/100;
	}
	
	
}
