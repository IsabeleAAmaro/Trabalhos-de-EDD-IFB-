package pack;
import java.util.Scanner;
public class Torre2 {
	    public static void main(String[] args) {
	    	Scanner tt = new Scanner(System.in);
	    	System.out.println("Insira um número:  ");
	        int n = tt.nextInt();
	        movs(n, 'A', 'C', 'B');
	        double mov = Math.pow(2, n) - 1;
	        System.out.println("Quantidade de movimentos necessários: " + mov);
	    }
	    public static void movs(int disco, char tori, char todest, char to) {
	        if (disco == 1) {
	            System.out.println("Movimentado o disco " + disco + " de " + tori + " para " + todest);
	        } else {
	            movs(disco - 1, tori, to, todest);
	            System.out.println("Movimentado o disco " + disco + " de " + tori + " para " + todest);
	            movs(disco - 1, to, todest, tori);
	        }
	    }
	}

