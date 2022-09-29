package com.adrianmedina.tema4poo;

public class SmartPhone extends SmartDevice{

	int numeroCamaras;
	boolean dobleLinea;
	
	
	public SmartPhone(String fabricante, String modelo, int year, double precio, boolean IP68, boolean llamadas,
			int numeroCamaras, boolean dobleLinea) {
		super(fabricante, modelo, year, precio, IP68, llamadas);
		this.numeroCamaras = numeroCamaras;
		this.dobleLinea = dobleLinea;
	}
	
	
	
	
	
}
