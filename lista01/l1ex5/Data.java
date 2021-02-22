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
	public boolean setDia(int dia) {
		if(dia >= 1 && dia <= 31){
			this.dia = dia;
			return true;
		}
		else{
			return false;
		}
	}
	public int getMes() {
		return this.mes;
	}
	public boolean setMes(int mes) {
		//mês precisa estar entre 1 e 12
		if((mes >= 1) && (mes <=12)) {
			//meses de Janeiro, Março, Maio, Julho, Agosto, Outubro e Dezembro têm 31 dias
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
				if (this.dia >= 1 && this.dia <= 31) {
					this.mes = mes;
					return true;
				}
				else {
					return false;
				}
			}
			//meses de Abril, Junho, Setembro e Novembro tem 30 dias
			else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (this.dia >= 1 && this.dia <= 30) {
					this.mes = mes;
					return true;
				}
				else {
					return false;
				}
			}
			//mês de fevereiro
			else {
				if (this.ano % 4 != 0) { //Ano não é bissexto
					if (this.dia >= 1 && this.dia <= 28) {
						this.mes = mes;
						return true;
					}
					else {
						return false;
					}
				}
				else if (this.ano % 4 == 0){//Ano pode ser bissexto
					if (this.ano % 100 != 0) {//Ano com certeza é bissexto
						if (this.dia >= 1 && this.dia <= 29) {
							this.mes = mes;
							return true;
						}
						else {
							return false;
						}
					}
					else {
						if(this.ano % 400 == 0) {
							this.mes = mes;
							return true;
						}
						else {
							return false;
						}
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public int getAno() {
		return this.ano;
	}
	public boolean setAno(int ano) {
		if(ano >= 0){
			this.ano = ano;
			return true;
		} else {
			return false;
		}
	}
	
	public int calculo() {
		int dias = (this.getMes() * 30);
		return dias;
	}
	public void imprimir() {
		System.out.println(" ");
		System.out.println("------------------------------------------------------");
		System.out.println("Data: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		System.out.println("Nesse ano já se passaram aproximadamente " + this.calculo() + " dias até o mês " + this.getMes());
	}
}
