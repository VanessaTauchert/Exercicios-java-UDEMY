package EstruturasRepetitivas;

import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		// 1- Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha 
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002
		
		//int senha = sc.nextInt();
		
		//while(senha != 2002) {
			
		//System.out.println("senha invalida");
		//senha = sc.nextInt();
		//}
		
		
		//System.out.println("senha correta");
		
		
		
		//2 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo 
		//menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).
		
		
		//int x = sc.nextInt();
		//int y = sc.nextInt();
		
		
		
		//while(x !=0 && y !=0) {
			
		//if (x >0 && y>0) {
			//System.out.println( x + " e " + y);
			//System.out.println("primeiro ponto");
		//}	
		//else if(x <0 && y>0) {
			//System.out.println( x + " e " + y);
			//System.out.println("segundo");
		//}
		//else if(x <0 && y<0) {
			//System.out.println( x + " e " + y);
			//System.out.println("terceiro");
		//}
		//else {
			//System.out.println( x + " e " + y);
			//System.out.println("quarto");
		//}
		
		//x = sc.nextInt();
		//y = sc.nextInt();
			
		//}
		
		//3 Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva 
		//um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 
		//4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� 
		//que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a 
		//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme 
		//exemplo
		
		System.out.println("Comandos:");
		System.out.println("1.�lcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.Fim");
		
		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(x!=4) {
			
			if(x==1) {
				alcool = alcool + 1;
			}
			else if(x==2) {
				gasolina = gasolina + 1;
				}
			else if(x==3) {
				diesel = diesel + 1;
				}
			x = sc.nextInt();
		} 
		
		
		System.out.println("Muito Obrigada");
		System.out.println("clientes alcool = " + alcool);
		System.out.println("clientes gasolina = " + gasolina);
		System.out.println("clientes diesel = " + diesel);
		
		sc.close();
		
	}

	
}
