package l1ex4;

public class Pessoa {
	public String nome;
	private int idade;
	private String pai;
	private String mae;
	
	public Pessoa(String nome, int idade, String pai, String mae) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setPai(pai);
		this.setMae(mae);
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPai() {
		return this.pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return this.mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	
	
	public void arvore() {
		System.out.println(" ");
		System.out.println("------------------------------------------------------");
		System.out.println(" | Pai: " + this.getPai() + "|  | Mãe: " + this.getMae() + "|");
		System.out.println(" ");
		System.out.println(" | Filho(a): " + this.getNome() + " |  | Idade: " + this.getIdade() + " anos |");
		System.out.println("------------------------------------------------------");
	}
}
