package com.alexandermakunin.ejercicio7;

import java.util.Objects;
import java.util.Random;

public class EntradaNormal extends Entrada{
    private final int asiento;
    private static final int[] asientosDisponibles = new int[Estadio.getCantZonas() * Zona.getCantFilas() * Zona.getCantAsientos()];
    private static int count;

    public EntradaNormal(Partido partido, int zona, int fila, Asiento asiento) {
        super(partido, zona, fila, asiento);
        this.asiento = recibirAsiento();
    }

    private static void rellenarAsientos() {
        for (int i = 0; i < asientosDisponibles.length; i++) {
            asientosDisponibles[i] = i;
        }
    }

    private int recibirAsiento() {
        Random random = new Random();
        int numAleatorio = random.nextInt(count);
        int numElegido = asientosDisponibles[numAleatorio];
        asientosDisponibles[numAleatorio] = asientosDisponibles[count];
        count--;
        return numElegido;
    }

    public int getNumAsiento() {
        return asiento;
    }

    public static void getAsientosDisponibles() {
        rellenarAsientos();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaNormal that = (EntradaNormal) o;
        return asiento == that.asiento;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(asiento);
    }


}
