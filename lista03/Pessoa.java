package lista03;

public class Pessoa {
	private String cpf;
	private String nome;
	
	
	public Pessoa(String cpf, String nome) {
		this.setCPF(cpf);
		this.setNome(nome);
	}

	
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
	
}
