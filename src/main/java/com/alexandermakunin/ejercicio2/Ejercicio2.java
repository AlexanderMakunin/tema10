package com.alexandermakunin.ejercicio2;

import com.alexandermakunin.ejercicio1.Punto;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Punto> vertices = new ArrayList<>();
        vertices.add(new Punto(0,0));
        vertices.add(new Punto(2,0));
        vertices.add(new Punto(2,2));
        vertices.add(new Punto(0,2));
        Poligono poligono = new Poligono(vertices);
        System.out.println(poligono);
        System.out.println(poligono.perimetro());
        poligono.traslada(4,-3);
        System.out.println(poligono);
        System.out.println(poligono.perimetro());
    }
}
