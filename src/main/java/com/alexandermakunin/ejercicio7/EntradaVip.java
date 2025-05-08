package com.alexandermakunin.ejercicio7;

import java.util.Objects;
import java.util.UUID;

public class EntradaVip extends Entrada {
    private final String alfanumerico = generarPasswd();

    public EntradaVip(Partido partido, int zona, int fila, Asiento asiento) {
        super(partido, zona, fila, asiento);
    }

    private String generarPasswd(){
        UUID codigo = UUID.randomUUID();
        return codigo.toString();
    }

    public String getAlfanumerico() {
        return alfanumerico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaVip that = (EntradaVip) o;
        return Objects.equals(alfanumerico, that.alfanumerico);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(alfanumerico);
    }
    @Override
    public String toString() {
        return "EntradaVip{" +
                "alfanumerico='" + alfanumerico + '\'' +
                '}';
    }
}
