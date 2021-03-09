package lista03;

public class Mecanico extends Pessoa {
	private String especialidade;
	
	
	public Mecanico(String especialidade, String cpf, String nome) {
		super(cpf, nome);
		this.setEspecialidade(especialidade);
	}

	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		return "Mecanico [especialidade=" + especialidade + "]";
	}
	
	
}
