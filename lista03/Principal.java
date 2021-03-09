package lista03;

public class Principal {

	public static void main(String[] args) {
		Oficina oficina = new Oficina();
		
		Servico servico1 = new Servico(171, "Revisão", 185.90);
		Servico servico2 = new Servico(190, "Alinhamento", 75.50);
		Servico servico3 = new Servico(911, "Troca de Óleo", 46.75);		
		
		Cliente cliente1 = new Cliente("555-0129", "407690859-00", "Beyoncé Knowles-Carter");
		Cliente cliente2 = new Cliente("666-1230", "518701960-11", "Jeff Bezos");
		Cliente cliente3 = new Cliente("777-2341", "131313131-13", "Murilo Pires");
		
		OrdemDeServico ordem1 = new OrdemDeServico(23, cliente1);
		OrdemDeServico ordem2 = new OrdemDeServico(24, cliente2);
		OrdemDeServico ordem3 = new OrdemDeServico(25, cliente3);
		OrdemDeServico ordem4 = new OrdemDeServico(26, cliente2);
	}

}
