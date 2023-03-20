import javax.swing.JOptionPane;

public class Operadores {
public static void main(String[] args) {
	double preco;
	double parcela;
	int qntparcelas;
	
	preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço a vista: "));
	parcela = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da parcela: "));
	qntparcelas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de parcelas: "));
	
	double totalparcel = parcela * qntparcelas;
	double juros = totalparcel - preco ;
	
	JOptionPane.showMessageDialog(null,"O total parcelado é:" + totalparcel);
	JOptionPane.showMessageDialog(null,"Os juros são:" + juros);
	
}
}
