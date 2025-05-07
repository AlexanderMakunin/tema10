package com.alexandermakunin.ejercicio5.tools;

import com.alexandermakunin.ejercicio5.block.Bloque;

public class Pico extends Herramienta {
    public Pico(String nombre, int durabilidad,int damage) {
        super(nombre, durabilidad,damage);
    }
    @Override
    public void minar(Bloque bloque) {
        super.setDurabilidad(super.getDurabilidad()-1);
        bloque.setActualStack(bloque.getActualStack()-1);
    }
}
