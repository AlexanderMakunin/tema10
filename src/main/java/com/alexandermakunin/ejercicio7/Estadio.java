package com.alexandermakunin.ejercicio7;

public class Estadio {
    private static final int CANT_ZONAS = 4;
    private final Zona[] zonas;

    public Estadio() {
        zonas = new Zona[CANT_ZONAS];
        rellenarEstadio();
    }

    private void rellenarEstadio() {
        int zonasVip = CANT_ZONAS / 3;
        int zonasNormal = CANT_ZONAS - zonasVip;
        int i;
        for (i = 0; i < zonasVip; i++) {
            zonas[i] = new Zona(true);
        }
        for (int j = i; i < zonasNormal; i++) {
            zonas[j] = new Zona(false);
        }
    }

    public static int getCantZonas() {
        return CANT_ZONAS;
    }

    public Zona[] getZonas() {
        return zonas;
    }
}
