package com.alexandermakunin;

import java.util.ArrayList;

public class Poligono {
    ArrayList<Punto> puntos;

    public Poligono(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }

    public void traslada() {

    }

    public int numVertices() {
        return puntos.size();
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "puntos=" + puntos +
                '}';
    }

    public double perimetro() {
        int perimetro;
        for (Punto punto : puntos) {

        }
    }
}
