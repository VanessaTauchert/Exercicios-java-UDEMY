package aula5Carrinho;

public class Produto {
	
	private String nome;
	private double preco;
	private boolean compra;
	
	public Produto(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
		this.compra = false;
	}

	public double getPreco() {
		return preco;
	}
	
	public void mDados() {
		System.out.println("Nome- " + nome);
		System.out.println("Preco- " + preco);
	}
	
	public void marcCompra() {
		compra = true;
	}
	
	public void desmCompra() {
		compra = false;
	}

	public boolean isCompra() {
		return compra;
	}
	
	
	
	
	
	
	
	
}
