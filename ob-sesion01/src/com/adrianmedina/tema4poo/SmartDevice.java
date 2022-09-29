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
}
