package lista03;
import java.util.List;

public class Oficina {
	private List<OrdemDeServico> ordensServico;
	
	public Oficina() {
		
	}
	
	
	public List<OrdemDeServico> getOrdensServico(){
		return ordensServico;
	}
	public void setOrdensServico(List<OrdemDeServico> ordensServico) {
		this.ordensServico = ordensServico;
	}
	
	
	public void adicionaOS(OrdemDeServico os) {
		ordensServico.add(os);
	}
	public List<OrdemDeServico> buscaOSServico(int codigo) {
		ordensServico.contains(codigo);
		return ordensServico;
	}
	public List<OrdemDeServico> buscaOSMecanico(String cpf) {
		ordensServico.contains(cpf);
		return ordensServico;
	}	
	public double calculaFaturamentoTotal() {
		//fazer algoritmo de calculo
		//return;
	}
	@Override
	public String toString() {
		return "Oficina [ordensServico=" + ordensServico + "]";
	}
	
}
