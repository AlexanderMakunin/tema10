package com.alexandermakunin.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indique la matricula");
        String matricula = scanner.nextLine();
        System.out.println("manual o automatico (1 para manual, 2 para automatico)");
        int seleccion = Integer.parseInt(scanner.nextLine());
        if (seleccion == 1) {
            CocheCambioManual coche = new CocheCambioManual(matricula);
            ponerMarchaAlCoche(coche);
            System.out.println(coche);
            coche.acelerar(60);
            System.out.println(coche);
            coche.setMarchaActual(1);
            coche.acelerar(60);
            System.out.println(coche);
        } else {
            CocheCambioAutomatico coche = new CocheCambioAutomatico(matricula);
            ponerMarchaAlCoche(coche);
            System.out.println(coche);
            coche.acelerar(60);
            System.out.println(coche);
        }
    }
    public static void ponerMarchaAlCoche(Coche coche) {
        System.out.println("indique las marchas");
        int cuantasMarchas = Integer.parseInt(scanner.nextLine());
        int[] marchas = new int[cuantasMarchas];
        for (int i = 0; i < cuantasMarchas; i++) {
            System.out.println("indique la velocidad maxima para la marcha: " + (i+1));
            int marcha = Integer.parseInt(scanner.nextLine());
            if (i > 1 && marchas[i-1] > marcha) {
                System.out.println("velocidad maxima de esta marcha es menor que la marcha anterior");
                i=-1;
            } else {
                marchas[i] = marcha;
            }
        }
        coche.setMarchas(marchas);
    }
}
