package exercicio4;
import javax.swing.JOptionPane;

public class exercicios12e3 {
	public static void main(String[] args) {
		//Resposta da quest�o 1: Toda aplica��o Java necessita deste m�todo
		//para ser executada porque o m�todo main ''chama'' a classe.
		
		//Resposta da quest�o 2: letra B.
		//Vai sair ''escreve dois'' porque na 6� linha do c�digo,
		//pergunta se y � maior que 5, e como n�o �,
		//ele executa o }else{ que vem logo em seguida.
		
		String pergunta1 = JOptionPane.showInputDialog("Qual � o seu nome?");
		String pergunta2 = JOptionPane.showInputDialog("Qual � o seu sabor favorito de pizza?");
				
		JOptionPane.showMessageDialog(null, pergunta2);
		JOptionPane.showMessageDialog(null, pergunta1);
	}
}


