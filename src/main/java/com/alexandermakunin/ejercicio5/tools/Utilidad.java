package com.alexandermakunin.ejercicio5.tools;

import com.alexandermakunin.ejercicio5.Objeto;

import java.util.Objects;

public class Utilidad extends Objeto {
    private int id = 0;
    private final String nombre;
    private int durabilidad;
    private final int damage;

    public Utilidad(String nombre, int durabilidad, int damage) {
        super(nombre,1);
        this.id = id + 1;
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        this.damage = damage;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    protected void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getDamage() {
        return damage;
    }

    public void aplicacion() {
        durabilidad=-1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilidad that = (Utilidad) o;
        return id == that.id && durabilidad == that.durabilidad && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, durabilidad);
    }

    @Override
    public String toString() {
        return "Herramienta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", durabilidad=" + durabilidad +
                '}';
    }
}
