package com.alexandermakunin.ejercicio5;

import java.util.Objects;

public abstract class Objeto {
    private static int id = 0;
    private final String nombre;
    private final int maxStack;

    public Objeto(String nombre, int maxStack) {
        id = id + 1;
        this.nombre = nombre;
        this.maxStack = maxStack;
    }

    public String getNombre() {
        return nombre;
    }
    public int getMaxStack() { return  maxStack; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(nombre, objeto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
