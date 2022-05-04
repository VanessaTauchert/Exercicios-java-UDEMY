package SwitchCase;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "invalido";
			break;
		}
		System.out.println("dia da semana " + dia);
		
		//forma normal
		double preco = 34.5;
		double desconto;
		
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		//condicional ternaria (condicao) ? verdadeiro : falso
		double precos = 34.5;
		double descontos = (precos < 20.0) ? precos * 0.1 : precos * 0.05;
		
		System.out.printf("hi" + descontos);
	}
	


}
