package com.alexandermakunin.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private final Estadio estadio = new Estadio();
    private final List<Entrada> entradaList;
    private Partido partido;

    public Gestion() {
        entradaList = new ArrayList<>();
    }

    public void nuevoPartido(LocalDate fecha, Afluencia tipo, String local, String visitante) {
        this.partido = new Partido(tipo,fecha,local,visitante);
    }

    public void ventaDeEntradas(int zona,int fila,int numAsientos) {
        if (estadio.getZonas()[zona].isVIP() ) {
            for (int i = 0; i < numAsientos; i++) {
                this.entradaList.add(new EntradaVip(partido,zona,fila,new Asiento(numAsientos)));
            }
        } else {
            for (int i = 0; i < numAsientos; i++) {
                this.entradaList.add(new EntradaNormal(partido,zona,fila,new Asiento(numAsientos)));
            }
        }

    }
    public boolean devolverEntrada(int id) {
        for (Entrada value : entradaList) {
            if (value.getId() == id) {
                value.getAsiento().setOcupado(false);
                return true;
            }
        }
        return false;
    }
    public Asiento[] listadoOcupados() {
        int countAsientosTotales = 0;
        for (Zona zona : estadio.getZonas()) {
            for (Fila fila : zona.getFilas()) {
                for (Asiento asiento : fila.getAsientos()) {
                    if (asiento.isOcupado()) {
                        countAsientosTotales++;
                    }
                }
            }
        }
        Asiento[] asientosArray = new Asiento[countAsientosTotales];
        int asientosCount = 0;
        for (Zona zona : estadio.getZonas()) {
            for (Fila fila : zona.getFilas()) {
                for (Asiento asiento : fila.getAsientos()) {
                    if (asiento.isOcupado()) {
                        asientosArray[asientosCount++] = asiento;
                    }
                }
            }
        }
        return asientosArray;
    }
    public Asiento[] listadoLibre() {
        int countAsientosTotales = 0;
        for (Zona zona : estadio.getZonas()) {
            for (Fila fila : zona.getFilas()) {
                for (Asiento asiento : fila.getAsientos()) {
                    if (!asiento.isOcupado()) {
                        countAsientosTotales++;
                    }
                }
            }
        }
        Asiento[] asientosArray = new Asiento[countAsientosTotales];
        int asientosCount = 0;
        for (Zona zona : estadio.getZonas()) {
            for (Fila fila : zona.getFilas()) {
                for (Asiento asiento : fila.getAsientos()) {
                    if (!asiento.isOcupado()) {
                        asientosArray[asientosCount++] = asiento;
                    }
                }
            }
        }
        return asientosArray;
    }
    public int recaudacion() {
        int precio = 0;
        for (Entrada entrada : entradaList) {
            precio = precio + entrada.getPrecio();
        }
        return precio;
    }

    public Partido getPartido() {
        return partido;
    }
}
