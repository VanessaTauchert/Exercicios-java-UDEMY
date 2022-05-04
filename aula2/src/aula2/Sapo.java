package aula2;

public class Sapo {
	int qtPulo;
	//metodo ou atrib static é aquele que esta desacoplado da instancia
	//e um membro que vive na classe e nao no objeto
	//deixa o membro com o escopo global a todos os objetos
	
	static int qtSapo;
	
	Sapo(){
		qtSapo++;
	}
	
	void pular() {
		qtPulo++;
	}
	
	void mostrar() {
		System.out.println("Pulos: " + qtPulo);
		System.out.println("Sapos: " + qtSapo);
	}
	
	static void sapear() {
		System.out.println("Sapossss");
	}
}
