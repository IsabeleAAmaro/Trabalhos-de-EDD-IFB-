public class Pessoa {
	private String nome;
	private double altura;
	private int MesDeNascimento;
	private int DiaDeNascimento;
	private int AnoDeNascimento;
	private int idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getMesDeNascimento() {
		return MesDeNascimento;
	}
	public void setMesDeNascimento(int mesDeNascimento) {
		MesDeNascimento = mesDeNascimento;
	}
	public int getDiaDeNascimento() {
		return DiaDeNascimento;
	}
	public void setDiaDeNascimento(int diaDeNascimento) {
		DiaDeNascimento = diaDeNascimento;
	}
	public int getAnoDeNascimento() {
		return AnoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		AnoDeNascimento = anoDeNascimento;
	}
	
	public void Imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Altura: " + altura);
		System.out.println("Ano de nascimento: " + AnoDeNascimento);
		System.out.println("Mes de nascimento: " + MesDeNascimento);
		System.out.println("Dia de nascimento: " + DiaDeNascimento);
	}
	
	public void CalcularIdade() {
		idade = 2019 - AnoDeNascimento;
		System.out.println("Idade: " + idade);
	}
	
	
}
