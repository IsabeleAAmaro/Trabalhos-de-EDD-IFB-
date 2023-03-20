package lista_de_exercicio_2;
import java.util.Scanner;

public class Questao123 {
	public static void main(String[] args) {
		
		//Questão 1:
		//Organizar o código e ajudar o entendimento de quem ve o código.
		
		//Questão 2:
		//letras C, E e F: short, boolean e double.
		
		Scanner batatinha = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius que vc quer converter");
		double Celsius = batatinha.nextDouble();
		
		double Fahrenheit = (9.0/5.0) * Celsius + 32;
		
		System.out.println("Temperatura em Fahrenheit:" + Fahrenheit);
		
	}
}