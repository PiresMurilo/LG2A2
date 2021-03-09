package lista03;
import java.util.List;

public class OrdemDeServico {
	private int codigo;
	private Cliente cliente;
	private List<Servico> servicos;
	private List<Mecanico> mecanicos;
	
	
	public OrdemDeServico(int codigo, Cliente cliente) {
		this.setCodigo(codigo);
		this.setCliente(cliente);
	}

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	public List<Mecanico> getMecanicos() {
		return mecanicos;
	}
	public void setMecanicos(List<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}
	
	
	public void adicionaServico(Servico servico) {
		servicos.add(servico);
	}
	public void adicionaMecanico(Mecanico mecanico) {
		mecanicos.add(mecanico);
	}
	/*
	public double calculaValorTotal() {
		return;
	} */
	public boolean possuiServico(int codigo) {
		if(servicos.contains(codigo)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean possuiMecanico(String cpf) {
		if(mecanicos.contains(cpf)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "OrdemDeServico [codigo=" + codigo + ", cliente=" + cliente + ", servicos=" + servicos + ", mecanicos="
				+ mecanicos + "]";
	}
	
	
}
