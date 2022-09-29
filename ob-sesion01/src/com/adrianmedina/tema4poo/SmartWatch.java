package com.adrianmedina.tema4poo;

public class SmartWatch extends SmartDevice{
	
	boolean correadepiel;

	public SmartWatch(String fabricante, String modelo, int year, double precio, boolean IP68, boolean llamadas,
			boolean correadepiel) {
		super(fabricante, modelo, year, precio, IP68, llamadas);
		this.correadepiel = correadepiel;
	}
	
	
}
