package l1ex2;

public class Contato {
	private String nome;
	private String sobrenome;
	private int ddd;
	private int telefone;
	private int celular;
	
	
	public Contato() {
	
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getDdd() {
		return this.ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getTelefone() {
		return this.telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCelular() {
		return this.celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	public void gravarContato() {
		System.out.println("----------------------------------------------");
		System.out.println("Nome: "+ this.getNome() + " " + this.getSobrenome());
		System.out.println("Telefone: (" + this.getDdd() + ") " + this.getTelefone());
		System.out.println("Celular: (" + this.getDdd() + ") " + this.getCelular());
	}

}
