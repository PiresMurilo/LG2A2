package l1ex1;

public class Pessoa {
	private String nome;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private float altura;
	
	public Pessoa(String n, int d, int m, int a, float alt) {
		this.setNome(n);;
		this.setDiaNascimento(d);
		this.setMesNascimento(m);
		this.setAnoNascimento(a);
		this.setAltura(alt);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDiaNascimento() {
		return this.diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public int getMesNascimento() {
		return this.mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public void apresentar() {
		System.out.println("-------------------------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Data de nascimento: " + this.getDiaNascimento() + "/" + this.getMesNascimento() + "/" + this.getAnoNascimento());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("-------------------------------------------");
	}
	
	
	public void idade() {
		int a = 2021;
		int ida = 0;
		if (this.getAnoNascimento() < a) {
			ida = a - this.getAnoNascimento();
			System.out.println("A idade de " + this.getNome() + " é " + ida + " anos");
		}
	}

}
