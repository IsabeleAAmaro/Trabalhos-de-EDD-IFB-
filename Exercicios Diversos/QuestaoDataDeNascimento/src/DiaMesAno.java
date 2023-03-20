import javax.swing.JOptionPane;

public class DiaMesAno {
	public static void main(String[] args) {
		
		//crie um programa em que o usuário digite, em janelas diferentes, o dia em que nasceu, o mês em que nasceu 
		//e o ano em que nasceu. Por fim, mostre uma janela com a frase: “Sua data de nascimento é 01/01/1991”, 
		//sendo a data formada pelos valores digitados.
		
		int ano;
		int mes;
		int dia;
		
		ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano que voce nasceu: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o mes que voce nasceu: "));
		dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano que voce nasceu: "));
		
		JOptionPane.showMessageDialog(null,"Sua data de nascimento é " + dia +  "/" + mes +  "/" + ano);
	}
	
}
