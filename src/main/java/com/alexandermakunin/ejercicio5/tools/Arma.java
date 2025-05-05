package com.alexandermakunin.ejercicio5.tools;

import com.alexandermakunin.ejercicio5.entity.Entity;

public abstract class Arma extends Utilidad {
    protected Arma(String nombre, int durabilidad, int damage) {
        super(nombre, durabilidad, damage);
    }

    public void golpear(Entity entity) {
        entity.setActualHp(entity.getActualHp()- getDamage());
        super.setDurabilidad(super.getDurabilidad()-1);
    }
}
