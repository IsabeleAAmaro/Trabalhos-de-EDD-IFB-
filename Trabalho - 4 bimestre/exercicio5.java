package exercicio4;

import javax.swing.JOptionPane;

public class exercicio5 {
	public static void main(String[] args) {
		String texto =  JOptionPane.showInputDialog(null, "Digite o primeiro n�mero");
	       String texto1 =  JOptionPane.showInputDialog(null, "Digite o segundo n�mero");
	       int number = Integer.parseInt(texto);
	       int numberoutro = Integer.parseInt(texto1);
	       int menos = number - numberoutro;
	       System.out.println("A diferen�a �:" + menos );

}
}

