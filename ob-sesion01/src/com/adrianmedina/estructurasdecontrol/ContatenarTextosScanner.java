package com.adrianmedina.estructurasdecontrol;

import java.util.Scanner;

public class ContatenarTextosScanner {

    public static void main(String[] args) {

        Scanner scannerTextos = new Scanner(System.in);
        System.out.println("ingresa texto: ");
        String nombres = scannerTextos.nextLine();

        System.out.println("Los Nombres concatenados son " + nombres + "\nFelicidades");


    }

}
