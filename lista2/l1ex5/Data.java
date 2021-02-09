package l1ex5;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int calculo() {
		int dias = (this.getMes() * 30);
		return dias;
	}
	public void imprimir() {
		System.out.println(" ");
		System.out.println("------------------------------------------------------");
		System.out.println("Data: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		System.out.println("Nesse ano já se passaram ou passarão, aproximadamente, " + this.calculo() + " dias até o mês " + this.getMes());
	}
}
