package com.alexandermakunin.ejercicio3;

import java.util.Arrays;

public abstract class Coche {
    private final String matricula;
    private int velocidadActual;
    private int marchaActual;
    private int[] marchas;

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidadActual = 0;
        this.marchaActual = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    public int[] getMarchas() {
        return marchas;
    }

    public void setMarchas(int[] marchas) {
        this.marchas = marchas;
    }

    public void acelerar(int velocidad) {
        if (this.velocidadActual < 0) {
            this.velocidadActual = 0;
        } else {
            this.velocidadActual=+velocidad;
            if (this.velocidadActual > getMarchas()[getMarchaActual()]) {
                this.velocidadActual = getMarchas()[getMarchaActual()];
            }
        }
    }

    public void frenar( int velocidad) {
        if (this.velocidadActual < 0) {
            this.velocidadActual = 0;
        } else {
            this.velocidadActual =- velocidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marchaActual=" + marchaActual +
                ", marchas=" + Arrays.toString(marchas) +
                '}';
    }

    protected void cambiarMarcha(int marcha) {
        if (marcha >= 0 && this.getMarchas().length > marcha && this.getMarchas().length < marcha) {
            this.marchaActual = marcha;
        }
    }
}
