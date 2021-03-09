package lista03;

public class Cliente extends Pessoa {
	private String telefone;
	
	
	public Cliente(String telefone, String cpf, String nome) {
		super(cpf, nome);
		this.setTelefone(telefone);
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Cliente [telefone=" + telefone + "]";
	}
	
}
