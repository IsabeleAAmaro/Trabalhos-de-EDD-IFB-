package exercicio4;

import javax.swing.JOptionPane;

public class exercicio5 {
	public static void main(String[] args) {
		String texto =  JOptionPane.showInputDialog(null, "Digite o primeiro número");
	       String texto1 =  JOptionPane.showInputDialog(null, "Digite o segundo número");
	       int number = Integer.parseInt(texto);
	       int numberoutro = Integer.parseInt(texto1);
	       int menos = number - numberoutro;
	       System.out.println("A diferença é:" + menos );

}
}

