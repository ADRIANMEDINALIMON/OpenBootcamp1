package com.adrianmedina.funciones;


public class Funciones {

    public static void main(String[] args) {

        //precio + iva%
        int resultado = sumaImpuesto(500, 16);
        System.out.println("el precio con impuestos es " + resultado);

    }

    static int sumaImpuesto(int precio, int iva) {
        return precio + precio / 100 * iva;


    }
}

