package lista_de_exercicio3;

public class Questao4x {
	public static void main(String[] args) {
		double fah;
		for(double cel = 0; cel <= 270; cel+=30) {
			fah =  (9.0/5.0) * cel + 32;
			System.out.println("Fahrenheit:" + fah + "//////////" + "Celsius" + cel);
			
		}
	}

}
