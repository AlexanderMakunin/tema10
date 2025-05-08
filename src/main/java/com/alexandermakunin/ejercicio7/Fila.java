package com.alexandermakunin.ejercicio7;

import java.util.Arrays;

public class Fila {
    private static final int CANT_ASIENTOS = Zona.getCantFilas();
    private final Asiento[] asientos;
    private static int count = 0;
    private final int numFila;

    public Fila() {
        this.asientos = new Asiento[CANT_ASIENTOS];
        this.numFila = ++count;
        rellenarFila();
    }

    private void rellenarFila() {
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = new Asiento(i+1);
        }
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public int getNumFila() {
        return numFila;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "asientos=" + Arrays.toString(asientos) +
                ", numFila=" + numFila +
                '}';
    }
}
