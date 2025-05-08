package com.alexandermakunin.ejercicio7;

import java.util.Arrays;

public class Zona {
    private static int count = 0;
    private final int id;
    private final boolean VIP;
    private static final int PRECIOBASE = 20;
    private static final int CANT_FILAS = 10;
    private static final int CANT_ASIENTOS = 100;
    private final Fila[] filas;

    public Zona(boolean VIP) {
        this.VIP = VIP;
        this.filas = new Fila[CANT_FILAS];
        this.id = ++count;
    }

    public boolean isVIP() {
        return VIP;
    }

    public Fila[] getFilas() {
        return filas;
    }

    public static int getCantFilas() {
        return CANT_FILAS;
    }

    public static int getPreciobase() {
        return PRECIOBASE;
    }

    public static int getCantAsientos() {
        return CANT_ASIENTOS;
    }

    @Override
    public String toString() {
        return "Zona{" +
                "VIP=" + VIP +
                ", filas=" + Arrays.toString(filas) +
                '}';
    }

    public int getId() {
        return id;
    }
}
