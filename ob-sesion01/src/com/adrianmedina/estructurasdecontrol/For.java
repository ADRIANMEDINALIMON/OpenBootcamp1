package com.adrianmedina.estructurasdecontrol;

public class For {

    public static void main(String[] args) {


        String[] nombres = { "juan", "paco" , "adrianmedina", "scarlett"};
        for(int i=0; i<nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        String[] nombres1 = { "nadia", "pacheco" , "adrianlimon", "scarface"};
        for(String nombre : nombres1){
            System.out.println(nombre);
        }




    }
}
