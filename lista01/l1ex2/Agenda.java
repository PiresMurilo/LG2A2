package l1ex2;

public class Agenda {

	public static void main(String[] args) {
		Contato c1 = new Contato();
		c1.setNome("Murilo");
		c1.setSobrenome("Pires");
		c1.setDdd(11);
		c1.setTelefone(58441884);
		c1.setCelular(962537592);
		
		Contato c2 = new Contato();
		c2.setNome("Diana");
		c2.setSobrenome("Teixeira");
		c2.setDdd(11);
		c2.setTelefone(58542995);
		c2.setCelular(989983980);
		
		Contato c3 = new Contato();
		c3.setNome("Taina");
		c3.setSobrenome("Lourenço");
		c3.setDdd(73);
		c3.setTelefone(37433349);
		c3.setCelular(996548829);
		
		Contato c4 = new Contato();
		c4.setNome("Murilo");
		c4.setSobrenome("Pires");
		c4.setDdd(21);
		c4.setCelular(988564276);
		
		c1.gravarContato();
		c2.gravarContato();
		c3.gravarContato();
		c4.gravarContato();

	}

}
