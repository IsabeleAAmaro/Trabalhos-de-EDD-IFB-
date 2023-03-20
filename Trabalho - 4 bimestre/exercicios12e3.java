package exercicio4;
import javax.swing.JOptionPane;

public class exercicios12e3 {
	public static void main(String[] args) {
		//Resposta da questão 1: Toda aplicação Java necessita deste método
		//para ser executada porque o método main ''chama'' a classe.
		
		//Resposta da questão 2: letra B.
		//Vai sair ''escreve dois'' porque na 6° linha do código,
		//pergunta se y é maior que 5, e como não é,
		//ele executa o }else{ que vem logo em seguida.
		
		String pergunta1 = JOptionPane.showInputDialog("Qual é o seu nome?");
		String pergunta2 = JOptionPane.showInputDialog("Qual é o seu sabor favorito de pizza?");
				
		JOptionPane.showMessageDialog(null, pergunta2);
		JOptionPane.showMessageDialog(null, pergunta1);
	}
}


