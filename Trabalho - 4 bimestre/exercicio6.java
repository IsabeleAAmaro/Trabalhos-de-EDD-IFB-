package exercicio4;

import javax.swing.JOptionPane;

public class exercicio6 {
	public static void main(String[] args) {
		String texto =  JOptionPane.showInputDialog(null, "Digite o primeiro número");
	       String texto1 =  JOptionPane.showInputDialog(null, "Digite o segundo número");
	       int number = Integer.parseInt(texto);
	       int numberoutro = Integer.parseInt(texto1);
	       int menos = number - numberoutro;
	       
	       while (menos < 10) {
				if (menos < 10)
				System.out.println("A diferença é menor que 10");
				break;
			}
			
			while (menos > 10) {
				if (menos > 10)
				System.out.println("A diferença é maior que 10");
				break;
			}
		}


}

