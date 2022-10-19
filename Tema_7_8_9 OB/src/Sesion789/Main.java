package Sesion789;

public class Main {

    public static void main(String[] args) {

        String cadenaInversa = "Hola Mundo";

        char primeraLetra = cadenaInversa.charAt(0);


        for (int i = cadenaInversa.length()-1; i >= 0; i--) {
            System.out.println(" la cadena invertida es " + cadenaInversa.charAt(i));
        }
    }
}
