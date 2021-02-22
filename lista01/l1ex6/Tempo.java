package l1ex6;

public class Tempo {
	public int horas;
	public int minutos;
	public int segundos;
	
	public Tempo(int horas, int minutos, int segundos) {
		this.setHoras(horas);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}	
	public Tempo() {
		this(0, 0, 0);
	}
	
	
	public int getHoras() {
		return this.horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return this.minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return this.segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	public int tudoSegundos() {
		int segs;
		segs = (this.getHoras()*3600) + (this.minutos)*60 + this.getSegundos();
		return segs;
	}
	
	public static Tempo segundosParaTempo(int total) {
		int segundos = total;
		int horas = segundos/3600;
		segundos = segundos - (horas*3600);
		int minutos = segundos/60;
		segundos = segundos - (minutos*60);
		return new Tempo(horas, minutos, segundos);
	}
	
	public Tempo somar(Tempo tempo) {
		return segundosParaTempo(this.tudoSegundos() + tempo.tudoSegundos());
	}
	
	public Tempo subtrair(Tempo tempo) {
		return segundosParaTempo(this.tudoSegundos() - tempo.tudoSegundos());
	}
	
	public void imprimir() {
		System.out.println("Horário: " + this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos());
		System.out.println(" ");
	}
}
