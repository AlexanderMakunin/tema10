package com.alexandermakunin.ejercicio5.entity;

public abstract class Entity {
    private static int id = 0;
    private double x = 0;
    private double y = 0;
    private final int maxHp;
    private int actualHp;
    private final String nombre;

    protected Entity(int maxHp, String nombre) {
        id = id + 1;
        this.maxHp = maxHp;
        this.nombre = nombre;
        this.actualHp = maxHp;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getActualHp() {
        return actualHp;
    }

    public void setActualHp(int actualHp) {
        this.actualHp = actualHp;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", maxHp=" + maxHp +
                ", actualHp=" + actualHp +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
