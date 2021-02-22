package l1ex3;

public class Matricula {
	public int matricula;
	public String nome;
	private float provaUm;
	private float provaDois;
	private float trabalho;
	
	public Matricula(int matricula, String nome, float prova1, float prova2, float trabalho) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setProvaUm(prova1);
		this.setProvaDois(prova2);
		this.setTrabalho(trabalho);
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getProvaUm() {
		return this.provaUm;
	}
	public void setProvaUm(float provaUm) {
		this.provaUm = provaUm;
	}
	public float getProvaDois() {
		return this.provaDois;
	}
	public void setProvaDois(float provaDois) {
		this.provaDois = provaDois;
	}
	public float getTrabalho() {
		return this.trabalho;
	}
	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}
	
	public float calculoMedia() {
		float p1, p2, t, media;
		p1 = this.getProvaUm();
		p2 = this.getProvaDois();
		t = this.getTrabalho();
		
		media = (p1 + p2 + t) / 3;
		
		//System.out.println("Média: " + media);
		return media;
	}
	
	public void situacao() {
		if (this.calculoMedia() >= 6) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Aluno: " + this.getNome());
			System.out.println("Média: " + this.calculoMedia());
			System.out.println("Situação: APROVADO!");
		} else if (6 > this.calculoMedia() && this.calculoMedia() >= 4) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Aluno: " + this.getNome());
			System.out.println("Média: " + this.calculoMedia());
			System.out.println("Situação: IFA. Entrar em contato com o professor da disciplina!");
		} else {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Aluno: " + this.getNome());
			System.out.println("Média: " + this.calculoMedia());
			System.out.println("Situação: REPROVADO! Entrar em contato com o professor da disciplina!");
		}
	}
	

}
