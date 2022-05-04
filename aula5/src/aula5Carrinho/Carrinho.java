package aula5Carrinho;

import java.util.ArrayList;

public class Carrinho {
	
	private String nCliente;
	private ArrayList<Produto> produtos;
	
	public Carrinho(String nCliente) {
		
		this.nCliente = nCliente;
		this.produtos = new ArrayList<Produto>();
	}
	
	public void add(Produto p) {
		produtos.add(p);
	}
	
	public void rem(Produto p) {
		produtos.remove(p);
	}
	
	public void atualizar(int indice, Produto novo) {
		produtos.set(indice, novo);
	}
	
	public void listar() {
		System.out.println("Nome Cliente- " + nCliente);
		for(Produto p : produtos) {
			p.mDados();
		}
	}
	
	public void listCompra() {
		for(Produto p : produtos) {
			if (p.isCompra())
				p.mDados();
		}
	}
	
	public double total() {
		double soma = 0;
		for(Produto p : produtos) {
			soma= soma + p.getPreco();
			
		}
		return soma;
	}
	
	public double totalCompra() {
		double soma = 0;
		for(Produto p : produtos) {
			if(p.isCompra())
				soma= soma + p.getPreco();
			
		}
		return soma;
	}
	
}
