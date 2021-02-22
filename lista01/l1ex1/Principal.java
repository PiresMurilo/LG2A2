package l1ex1;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Murilo Pires", 8, 5, 1997, 1.81f);
		p1.apresentar();
		p1.idade();
		
		Pessoa p2 = new Pessoa("Beyoncé Knowles", 4, 9, 1981, 1.70f);
		p2.apresentar();
		p2.idade();
		
		Pessoa p3 = new Pessoa("Jeff Bezos", 12, 1, 1964, 1.71f);
		p3.apresentar();
		p3.idade();
		
		Pessoa p4 = new Pessoa("Elon Musk", 28, 6, 1971, 1.88f);
		p4.apresentar();
		p4.idade();

	}

}
