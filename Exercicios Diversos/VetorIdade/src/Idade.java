import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner tecladinho = new Scanner(System.in); 
		int[] idades = new int[5];
		String[] nomes = new String[5];
		int MaisJovem = idades[0];
		int MaisVelho = idades[0];
		int i;
		
		System.out.println("Digite os nomes: ");
		for (i = 0; i <= 4; i++) {
		nomes[i] = tecladinho.nextLine(); 
		}
		
		System.out.println("Digite as idades: ");
		for (i = 0; i <= 4; i++) {
		idades[i] = tecladinho.nextInt();
		}
		
		for(int j=1; j< idades.length; j++) {
			if(idades[j] > MaisVelho)
				MaisVelho = idades[j];
			else if (idades[j] < MaisJovem)
				MaisJovem = idades[j];
		}
		
		System.out.println("A pessoa mais jovem é: " + MaisJovem + "E seu nome é: " + nomes[MaisJovem]);
    }  
	}
