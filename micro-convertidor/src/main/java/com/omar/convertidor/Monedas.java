package com.omar.convertidor;

public class Monedas {

	private int pesos;
	private int dolar;
	
	
	
	public Monedas(int pesos, int dolar) {
		this.pesos = pesos;
		this.dolar = dolar;
	}
	
	public Monedas() {
		
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
