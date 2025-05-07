package com.alexandermakunin.ejercicio5.usable;

import com.alexandermakunin.ejercicio5.Objeto;

public class Usable extends Objeto {
    private final String nombre;
    private int actualStack = 0;
    public Usable(String nombre) {
        super(nombre,15);
        this.nombre = nombre;
        actualStack = getActualStack()+1;
    }

    public int getActualStack() {
        return actualStack;
    }

    public void setActualStack(int actualStack) {
        this.actualStack = actualStack;
    }

    public void usarUtilizable() {
        actualStack--;
    }

    @Override
    public String toString() {
        return "Usable{" +
                "nombre='" + nombre + '\'' +
                ", actualStack=" + actualStack +
                '}';
    }
}
