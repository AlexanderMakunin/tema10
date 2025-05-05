package com.alexandermakunin.ejercicio5.tools;

import com.alexandermakunin.ejercicio5.entity.Entity;

public class Espada extends Arma {
    public Espada(String nombre, int durabilidad, int damage) {
        super(nombre, durabilidad,damage);
    }
    @Override
    public void golpear(Entity entity) {
        super.golpear(entity);
    }
}
