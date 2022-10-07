package com.adrianmedina.tema4poo;

public class SmartDevice {

    String fabricante;
    String modelo;
    int year;
    double precio;
    boolean IP68;
    boolean llamadas;

    // constructor
    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String modelo, int year, double precio, boolean IP68, boolean llamadas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.IP68 = IP68;
        this.llamadas = llamadas;
        
        
        
    }

	@Override
	public String toString() {
		return "SmartDevice [fabricante=" + fabricante + ", modelo=" + modelo + ", year=" + year + ", precio=" + precio
				+ ", IP68=" + IP68 + ", llamadas=" + llamadas + "]";
	}
}
