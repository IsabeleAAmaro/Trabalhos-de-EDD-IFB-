package lista_de_exercicio3;
import java.util.Scanner;

public class Questao123 {	
			//Quest�o 1:
			//Inicializar � atribuir um valor para uma vari�vel e declarar � ''declarar'' que
			//essa vari�vel existe mas sem necessariamente atruibuir um valor
			
			//Quest�o 2:
			//b) dezena.
			//c) centena.
			//d) milhar.
			//e) outro
			//Imprimir� tudo isso pois n�o h� 'break;' nos cases
			
			public static void main(String[] args) {
				Scanner teclado = new Scanner (System.in);
				int opcao = teclado.nextInt();
				System.out.println("Op��es:\\n\\n1 - Adi��o\\n2 - Subtra��o\\n3 - Divis�o\\n4 - Multiplica��o");
		        switch(opcao) {
		            case 1:
		            	System.out.println("Digite dois n�meros");
		            	int num1 = teclado.nextInt();
		            	int num2 = teclado.nextInt();
		            	int soma = num1 + num2;
		            	System.out.println("A soma entre esses dois n�meros �:" + soma);
		                break;
		            case 2:
		            	System.out.println("Digite dois n�meros");
		            	int a = teclado.nextInt();
		            	int b = teclado.nextInt();		            	
		            	int sub = a - b;
		            	System.out.println("A subtra��o entre esses dois n�meros �:" + sub);
		                break;
		            case 3:
		            	System.out.println("Digite dois n�meros");
		            	int c = teclado.nextInt();
		            	int d = teclado.nextInt();		            	
		            	int divisao = c / d;
		            	System.out.println("A divis�o entre esses dois n�meros �:" + divisao);
		                break;
		            case 4:
		            	System.out.println("Digite dois n�meros");
		            	int e = teclado.nextInt();
		            	int f = teclado.nextInt();		            	
		            	int mult = e * f;
		            	System.out.println("A divis�o entre esses dois n�meros �:" + mult);
		            default:
		        }
		    }
		    
			{


			}

			
		}
