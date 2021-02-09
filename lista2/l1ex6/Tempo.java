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
	
	
	public void imprimir() {
		System.out.println("Horário: " + this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos());
		System.out.println(" ");
	}
}
