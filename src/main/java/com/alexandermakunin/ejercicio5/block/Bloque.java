package com.alexandermakunin.ejercicio5.block;

import com.alexandermakunin.ejercicio5.Objeto;
import java.util.Objects;

public abstract class Bloque extends Objeto {
    private int actualStack = 0;

    public Bloque(String nombre) {
        super(nombre,64);
    }

    public int getMaxStack() {
        return 64;
    }

    public int getActualStack() {
        return actualStack;
    }

    public void setActualStack(int actualStack) {
        this.actualStack = actualStack;
    }

    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bloque bloque = (Bloque) o;
        return Objects.equals(super.getNombre(), bloque.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.getNombre());
    }

    @Override
    public String toString() {
        return "Bloque{" +
                "nombre='" + super.getNombre() + '\'' +
                ", actualStack=" + actualStack +
                '}';
    }
}
