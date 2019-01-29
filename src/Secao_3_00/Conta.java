package Secao_3_00;

public class Conta {

	private int numeroDaConta;
	private String nomeTitular;
	private double saldo;
	
	
	
	public Conta(int numeroDaConta, String nomeTitular, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		Deposito(saldo);
	}
	
	public Conta(int numeroDaConta, String nomeTitular) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}


	public void Deposito(double saldo) {
		this.saldo += saldo;
		
		
	}
	
	public void Saque(double saldo) {
		if(this.saldo >=0) {
			this.saldo -= 5;
			this.saldo -= saldo;
		}
	}	
		
		
public void MostraDados() {
		System.out.printf("Account "+ getNumeroDaConta()+ ", Holder: "+ getNomeTitular() +", Balance: $ %.2f" , getSaldo());
		
	}	
		
		
		
		

	
	
	
	
	
}
