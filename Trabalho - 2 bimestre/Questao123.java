package lista_de_exercicio_2;
import java.util.Scanner;

public class Questao123 {
	public static void main(String[] args) {
		
		//Quest�o 1:
		//Organizar o c�digo e ajudar o entendimento de quem ve o c�digo.
		
		//Quest�o 2:
		//letras C, E e F: short, boolean e double.
		
		Scanner batatinha = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius que vc quer converter");
		double Celsius = batatinha.nextDouble();
		
		double Fahrenheit = (9.0/5.0) * Celsius + 32;
		
		System.out.println("Temperatura em Fahrenheit:" + Fahrenheit);
		
	}
}