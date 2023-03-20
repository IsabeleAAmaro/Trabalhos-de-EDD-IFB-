package exercicio4;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio4 {
	public static void main(String[] args) {
	String texto =  JOptionPane.showInputDialog(null, "Digite o número");
	int number = Integer.parseInt(texto); {
		
		while (number < 10) {
			if (number < 10)
			System.out.println("O número é menor que 10");
			break;
		}
		
		while (number > 10) {
			if (number > 10)
			System.out.println("O número é maior que 10");
			break;
		}
	}

	


}
}

