package com.alexandermakunin.ejercicio2;

import com.alexandermakunin.ejercicio1.Punto;

import java.util.ArrayList;

public class Poligono {
    ArrayList<Punto> vertices;

    public Poligono(ArrayList<Punto> puntos) {
        this.vertices = puntos;
    }

    public void traslada(double x, double y) {
        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).setX(vertices.get(i).getX() + x);
            vertices.get(i).setY(vertices.get(i).getY() + y);
        }
    }

    public int numVertices() {
        return vertices.size();
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "puntos=" + vertices +
                '}';
    }

    public double perimetro() {
        double perimetro = 0.0;
        int n = vertices.size();
        for (int i = 0; i < n; i++) {
            Punto actual = vertices.get(i);
            Punto siguiente = vertices.get((i + 1) % n);
            perimetro += actual.distancia(siguiente);
        }
        return perimetro;
    }
}
