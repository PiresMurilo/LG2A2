package o_financeiro;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Dados {
	//atributos
	public String nome;
	public LocalDateTime data;
	private BigDecimal contasConsumo;
	private BigDecimal mercado;
	private boolean completo;
    private BigDecimal educacao;
    private BigDecimal saude;
    private BigDecimal transporte;
    //public TipoTransacao tipo; PRECISO ENUM
    
    //metodos:
    
    //construtor
    public Dados(String n, LocalDateTime dt, BigDecimal cC, BigDecimal mkt, boolean complete, BigDecimal edu, BigDecimal sau, BigDecimal trans) {
    	this.setNome(n);
    	this.setData(dt);
    	this.setContasConsumo(cC);
    	this.setMercado(mkt);
    	this.completo = complete;
    	this.setEducacao(edu);
    	this.setSaude(sau);
    	this.setTransporte(trans);
    }
    
    //getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
    public LocalDateTime getData() {
    	return this.data;
    }
    public void setData(LocalDateTime dt) {
    	this.data = dt;
    }
    public BigDecimal getContasConsumo() {
    	return this.contasConsumo;
    }
    public void setContasConsumo(BigDecimal cC) {
    	this.contasConsumo = cC;
    }
    public BigDecimal getMercado() {
    	return this.mercado;
    }
    public void setMercado(BigDecimal mkt) {
    	this.mercado = mkt;
    }
    public BigDecimal getEducacao() {
    	return this.educacao;
    }
    public void setEducacao(BigDecimal edu) {
    	this.educacao = edu;
    }
    public BigDecimal getSaude() {
    	return this.saude;
    }
    public void setSaude(BigDecimal sau) {
    	this.saude = sau;
    }
    public BigDecimal getTransporte() {
    	return this.transporte;
    }
    public void setTransporte(BigDecimal trans) {
    	this.transporte = trans;
    }
	
    //demais metodos:
    public void Extrato() {
    	System.out.println("Seja bem-vindo ao sistema de orçamento financeiro Sr(a) "+ getNome());
    	System.out.println("Os seus gastos fundamentais do mês foram: ");
    	System.out.println("-> Contas de consumo (água, luz e gás): R$ "+ getContasConsumo());
    	System.out.println("-> Mercado: R$ "+ getMercado());
    	if (completo == true) {
    		System.out.println("Os seus gastos secundários do mês foram: ");
    		System.out.println("-> Saúde: "+ getSaude());
    		System.out.println("-> Educação: "+ getEducacao());
    		System.out.println("-> Transporte: "+ getTransporte());
    		System.out.println("Fim da operação em: "+ getData());
    		System.out.println(" ");
    	}
    	else {
    		System.out.println("Fim da operação em: "+ getData());
    		System.out.println(" ");
    	}
    }
    
}
