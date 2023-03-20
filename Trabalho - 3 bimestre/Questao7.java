package lista_de_exercicio3;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int fact = 1;
		System.out.println("Digite o número:");
		int valor = teclado.nextInt();
		for(int i = 2; i <= valor;i++) {
		     fact *= i;
		}
		System.out.println( "O fatorial de " + valor + " é igual a " + fact );
		}

}

