public class Principal {
	public static void main(String[] args) {
		
		Pessoa Joao = new Pessoa();
		Joao.setAltura(1.96);
		Joao.setAnoDeNascimento(1997);
		Joao.setDiaDeNascimento(02);
		Joao.setMesDeNascimento(12);
		Joao.setNome("João Amaro Martins");
		
		Joao.CalcularIdade();
		
		Joao.Imprimir();
	}
	

}
