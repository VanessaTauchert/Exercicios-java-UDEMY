package aula5ex2;

public class Cliente {
	private String nome;
	double saldo, limite;
	
	
	
	public Cliente(String nome, double saldo, double limite) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void sacar(double val) {
		if(val >= saldo) {
			saldo= saldo - val;
		} else {
			System.out.println("Sem saldo");
		}
		
	}
	
	public void depositar(double val) {		
			saldo= saldo + val;	
		
	}
	
	public double checarS() {
		
		return saldo + limite;
	}
	
	public void InfCli() {
		System.out.println("Nome- " + nome);
		System.out.println("Saldo- " + saldo);
		System.out.println("Limite- " + limite);
		System.out.println("Saldo- " + checarS());
	}
	
}
