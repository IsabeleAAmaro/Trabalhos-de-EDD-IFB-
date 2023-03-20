package lista_de_exercicio3;
import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a sua nota na lista de exercícios:");
		int va1 = teclado.nextInt();
		
		if(va1>10 && va1<0) {
			System.out.println("Valor inválido! Digite uma nota de 0 a 10");
		}
		
		System.out.println("Digite sua nota no seminário");
		int va2 = teclado.nextInt();
		
		if(va2>10 && va2<0) {
			System.out.println("Valor inválido! Digite uma nota de 0 a 10");
		}
		
		System.out.println("Digite sua nota na prova final");
		int va3 = teclado.nextInt();
		
		if(va3>10 && va3<0) {
			System.out.println("Valor inválido! Digite uma nota de 0 a 10");
		}
		
		int media = ((va1 * 2) + (va2 * 3) + (va3 * 5)) / 10;

		if(media>=6) {
		System.out.println("Aprovado");
		}else
		System.out.println("Em construção");
		}
	
{
}
}

