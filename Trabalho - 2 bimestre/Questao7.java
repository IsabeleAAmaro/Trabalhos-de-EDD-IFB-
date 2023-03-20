package lista_de_exercicio_2;
import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int base;
		int ex;
		int ptc = 1;
			System.out.println("Digite uma base");
			base = teclado.nextInt();
			System.out.println("Digite uma expoente");
			ex = teclado.nextInt();
			for (int i=0; i<ex; i++) {
				ptc *= base;
			}
			System.out.println("Resultado:" + ptc);
		}
	}

