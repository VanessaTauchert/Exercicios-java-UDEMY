package aula5Carrinho;

public class Teste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Chave", 2.00);
		Produto p2 = new Produto("Caneta", 5.00);
		Produto p3 = new Produto("Lapis", 2.60);
		Produto p4 = new Produto("Blusa", 3.20);
		Produto p5 = new Produto("Vidro", 10.00);
		p5.marcCompra();
		p4.marcCompra();
		p5.marcCompra();
		
		Carrinho c1 = new Carrinho("Vanessa");
		c1.add(p2);
		c1.add(p3);
		c1.add(p5);
		c1.add(p5);
		c1.rem(p2);
		c1.total();
		c1.listar();
		System.out.println("Total- " + c1.total());
		System.out.println("Total Marcados- " + c1.totalCompra());
		
		
		
	}

}
