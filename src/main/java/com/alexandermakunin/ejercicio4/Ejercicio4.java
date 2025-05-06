package com.alexandermakunin.ejercicio4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Random random = new Random();
        int aleatorio;
        for (int i = 0; i < electrodomesticos.length; i++) {
            aleatorio = random.nextInt(3);
            if (aleatorio == 1) {
                electrodomesticos[i] = new Lavadora(random.nextInt(200),"blanco", (char) random.nextInt(64,64+7) , random.nextInt(),random.nextInt());
            } else if (aleatorio == 2) {
                electrodomesticos[i] = new Television(random.nextInt(250),"blanco", (char) random.nextInt(64,64+7) , random.nextInt(),random.nextInt(), random.nextDouble(), random.nextBoolean());
            } else {
                electrodomesticos[i] = new Electrodomestico(random.nextInt(250),random.nextInt(60));
            }
            System.out.println(electrodomesticos[i]);
        }
        for (int i = 0; i < electrodomesticos.length; i++) {
            System.out.println(electrodomesticos[i].getClass());
            System.out.println(electrodomesticos[i].getPrecioBase());
            System.out.println(electrodomesticos[i].precioFinal());
        }
        int countElectrodomesticos = 0;
        int countLavadoras = 0;
        int countTelevisiones = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) {
                countTelevisiones = electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                countLavadoras = electrodomestico.precioFinal();
            } else {
                countElectrodomesticos = electrodomestico.precioFinal();
            }
        }
        System.out.println("Electrodomesticos: " + countElectrodomesticos);
        System.out.println("Lavadoras: " + countLavadoras);
        System.out.println("Televisiones: " + countTelevisiones);
    }
}
