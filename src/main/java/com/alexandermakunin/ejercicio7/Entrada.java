package com.alexandermakunin.ejercicio7;

public abstract class Entrada {
    private static int contador = 0;
    private final int id;
    private final Partido partido;
    private final int zona;
    private final int fila;
    private final Asiento asiento;
    private final int precio;

    public Entrada(Partido partido, int zona, int fila, Asiento asiento) {
        this.id = ++contador;
        this.partido = partido;
        this.zona = zona;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = calcularPrecio();
    }

    public int calcularPrecio() {
      Afluencia afluencia  = partido.getAfluencia();
      int precio = Zona.getPreciobase();
      return switch (afluencia) {
          case BAJA_AFLUENCIA -> precio * 75/100;
          case ALTA_AFLUENCIA -> precio * 130/100;
          case MEDIA_AFLUENCIA -> Zona.getPreciobase();
      };
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public int getId() {
        return id;
    }

    public int getFila() {
        return fila;
    }

    public int getZona() {
        return zona;
    }
    public int getPrecio() {
        return precio;
    }
}
