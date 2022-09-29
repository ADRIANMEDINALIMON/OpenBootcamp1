package com.adrianmedina.tema4poo;

public class Main {

    public static void main(String[] args) {
    	
    	
    	SmartPhone ifon = new SmartPhone("Apo", "ifon300", 22, 3000, true, true, 5, false);
    	
    	System.out.println(ifon.modelo);
    	System.out.println(ifon.toString());
    	
    	SmartWatch relojPro = new SmartWatch("Apo", "RelojPro", 23, 2000, false, false, true);
    	
    	System.out.println(ifon.modelo);
    	System.out.println(ifon.toString());
    	
    }
}
