package lista_de_exercicio_2;
import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner batatinha = new Scanner(System.in);
		
		System.out.print("Digite dois n�meros");
		
		int num = batatinha.nextInt();
		int num2 = batatinha.nextInt();
		
		if(num2 > num) {
			System.out.print("Ordem crescente dos n�meros digitados:" + num2 + " , " + num);
			
		}
		
		if(num > num2) {
			System.out.print("Ordem crescente dos n�meros digitados:" + num + " , " + num2);
		}
	}

}

