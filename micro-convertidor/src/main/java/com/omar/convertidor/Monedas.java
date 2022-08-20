package com.omar.convertidor;

public class Monedas {

	private int pesos;
	private String trm;
	private int dolar;
	
	
	
	public Monedas(int pesos, String trm, int dolar) {
		this.pesos = pesos;
		this.trm = trm;
		this.dolar = dolar;
	}
	
	public Monedas() {
		
	}
	
	
	
	public String getTrm() {
		return trm;
	}

	public void setTrm(String trm) {
		this.trm = trm;
	}

	public int getPesos() {
		return pesos;
	}
	public void setPesos(int pesos) {
		this.pesos = pesos;
	}
	public int getDolar() {
		return dolar;
	}
	public void setDolar(int dolar) {
		this.dolar = dolar;
	}
}
