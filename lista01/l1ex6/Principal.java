package l1ex6;

public class Principal {

	public static void main(String[] args) {
		Tempo h1 = new Tempo(22, 34, 51);
		h1.imprimir();
		
		Tempo h2 = new Tempo(18, 48, 33);
		h2.imprimir();
			
		Tempo h3 = new Tempo(10, 53, 11);
		h3.imprimir();
		
		Tempo h4 = new Tempo(00, 19, 14);
		h4.imprimir();
		
		Tempo h5 = h1.subtrair(h2);
		h5.imprimir();
		
		Tempo h6 = h3.somar(h4);
		h6.imprimir(); 
		
		

	}

}
