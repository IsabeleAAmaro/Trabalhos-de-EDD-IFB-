package lista_de_exercicio3;
import java.util.Scanner;

public class Questao123 {	
			//Questão 1:
			//Inicializar é atribuir um valor para uma variável e declarar é ''declarar'' que
			//essa variável existe mas sem necessariamente atruibuir um valor
			
			//Questão 2:
			//b) dezena.
			//c) centena.
			//d) milhar.
			//e) outro
			//Imprimirá tudo isso pois não há 'break;' nos cases
			
			public static void main(String[] args) {
				Scanner teclado = new Scanner (System.in);
				int opcao = teclado.nextInt();
				System.out.println("Opções:\\n\\n1 - Adição\\n2 - Subtração\\n3 - Divisão\\n4 - Multiplicação");
		        switch(opcao) {
		            case 1:
		            	System.out.println("Digite dois números");
		            	int num1 = teclado.nextInt();
		            	int num2 = teclado.nextInt();
		            	int soma = num1 + num2;
		            	System.out.println("A soma entre esses dois números é:" + soma);
		                break;
		            case 2:
		            	System.out.println("Digite dois números");
		            	int a = teclado.nextInt();
		            	int b = teclado.nextInt();		            	
		            	int sub = a - b;
		            	System.out.println("A subtração entre esses dois números é:" + sub);
		                break;
		            case 3:
		            	System.out.println("Digite dois números");
		            	int c = teclado.nextInt();
		            	int d = teclado.nextInt();		            	
		            	int divisao = c / d;
		            	System.out.println("A divisão entre esses dois números é:" + divisao);
		                break;
		            case 4:
		            	System.out.println("Digite dois números");
		            	int e = teclado.nextInt();
		            	int f = teclado.nextInt();		            	
		            	int mult = e * f;
		            	System.out.println("A divisão entre esses dois números é:" + mult);
		            default:
		        }
		    }
		    
			{


			}

			
		}
