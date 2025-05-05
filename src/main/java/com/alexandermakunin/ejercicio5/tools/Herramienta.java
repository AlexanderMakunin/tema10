package com.alexandermakunin.ejercicio5.tools;
import com.alexandermakunin.ejercicio5.block.Bloque;

public abstract class Herramienta extends Utilidad {
    protected Herramienta(String nombre, int durabilidad, int damage) {
        super(nombre, durabilidad,damage);
    }

    public void minar(Bloque bloque) {
        super.setDurabilidad(super.getDurabilidad()-1);
    }
}
