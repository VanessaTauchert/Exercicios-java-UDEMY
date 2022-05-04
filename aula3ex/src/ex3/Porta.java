package ex3;

public class Porta {
	boolean isOpen;
	int numAbert;
	
	
	void abrir() {
		if(isOpen ==false){
		isOpen = true;
		numAbert++;
		System.out.println("Porta Aberta");
	} 
	else {
		System.out.println("Porta já Aberta");
	}
	
	
	}	
	
	void fechar() {
		if(isOpen == true) {
			isOpen = false;
			
			System.out.println("Porta fechada");
		}
		else {
			System.out.println("Porta já fechada");
		}
	}
	
	void mostrar() {
		System.out.println("Porta aberta " + numAbert + " vezes");
	}
}
