package lista_de_exercicio_2;
import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double media;
		double soma = 0;
		
		System.out.println("Digite as �ltimas 7 cota��es do D�lar");
		
		for (int i = 0; i <7; i++) {
			double mocota = teclado.nextDouble();
			soma += mocota;
			
		}
		media = soma / 7;
		
		System.out.println("A m�dia da cota��o do d�lar �:" + media);
		
		
	}
}