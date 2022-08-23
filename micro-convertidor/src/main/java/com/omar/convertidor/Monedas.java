package com.omar.convertidor;

public class Monedas {

	private Double pesos;
	private Integer trm;
	private Double dolar;
	
	
	
	public Monedas(Double pesos, Integer trm, Double dolar) {
		this.pesos = pesos;
		this.trm = trm;
		this.dolar = dolar;
	}
	
	public Monedas() {
		
	}

	public Double getPesos() {
		return pesos;
	}

	public void setPesos(Double pesos) {
		this.pesos = pesos;
	}

	public Integer getTrm() {
		return trm;
	}

	public void setTrm(Integer trm) {
		this.trm = trm;
	}

	public Double getDolar() {
		return dolar;
	}

	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}
	
	
	
	
}
