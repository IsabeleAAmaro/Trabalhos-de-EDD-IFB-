package exercicio4;

import javax.swing.JOptionPane;

public class exercicio7 {
	public static void main(String[] args) {
		String texto =  JOptionPane.showInputDialog(null, "Digite a idade");
		int idade = Integer.parseInt(texto); {
			
			while (idade < 2) {
				if (idade < 2)
				System.out.println("Vc é um bebê :3");
				break;
			}
			
			while (idade >= 3 && idade <= 11) {
				if (idade >= 3 && idade <= 11)
				System.out.println("Vc é uma criança");
				break;
			}
			while (idade >= 12 && idade <= 17) {
				if (idade >= 12 && idade <= 17)
				System.out.println("Vc é um adolescente");
				break;
		}
			while (idade >=18  && idade <=24) {
				if (idade >=18 && idade <=24)
				System.out.println("Vc é jovem");
				break;
		}
			while (idade >=25  && idade <=59) {
				if (idade >=25 && idade <=59)
				System.out.println("Vc é um adulto");
				break;
		}
			while (idade >=60  && idade <=99) {
				if (idade >=60 && idade <=99)
				System.out.println("Vc é um idoso");
				break;
		}
			while (idade > 100) {
				if (idade > 100)
				System.out.println("Vc é um ancião");
				break;
		}


		}
		

}
}
