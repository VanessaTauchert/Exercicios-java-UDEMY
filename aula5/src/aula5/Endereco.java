package aula5;

public class Endereco {
	
	private String cep, logradouro, cidade;
	private Estado estado;
	
	public Endereco(String cep, String logradouro, String cidade, Estado estado) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void mDados() {
		System.out.println("CEP- " + cep);
		System.out.println("Endereco- " + logradouro);
		System.out.println("Idade- " + cidade);
		System.out.println("Estado- " + estado);
	}
}
