package Sesion789;


import java.util.Vector;

public class Arrays {

    public static void main(String[] args) {

        System.out.println("-------1.-Arrays String---------");

        String arregloEnteros[] = {"uno", "dos", "tres", "cuatro"};

        for (String i : arregloEnteros) {
            System.out.println(i);
        }

        System.out.println("----------2.-Arrays int------------");

        int numerosBI[][] = new int[2][4];
        numerosBI[0][0] = 1;
        numerosBI[0][1] = 5;
        numerosBI[0][2] = 10;
        numerosBI[0][3] = 20;

        numerosBI[1][0] = 100;
        numerosBI[1][1] = 500;
        numerosBI[1][2] = 1000;
        numerosBI[1][3] = 2000;

        for (int i = 0; i < numerosBI.length; i++) {
            System.out.println("valor i: " + i);

            for (int j = 0; j < numerosBI[1].length; j++) {
                System.out.println("valor i:" + i + ", j:" + j);
                System.out.println(numerosBI[i][j]);


            }
            }
        System.out.println("----------3.-vectores------------");
        Vector<String> vectorCoche = new Vector(10, 20);
        vectorCoche.add("BMW");
        vectorCoche.add("VW");
        vectorCoche.add("TESLA");
        vectorCoche.add("GMC");
        vectorCoche.add("HONDA");

        System.out.println("Los 5 Datos son:" + vectorCoche);

        System.out.println("--------4.-vector 1000 elementos---------");

        System.out.println("El problema es que se dublica la capacidad entonces " +
                "al llegar a 1000 se duplicaria desperdiciando espacio" +   vectorCoche.size());




        }
    }
