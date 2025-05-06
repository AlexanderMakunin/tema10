package com.alexandermakunin.ejercicio6;

public class Videojuego extends Multimedia {
    private String plataforma;

    public Videojuego(String titulo, String autor, Formato formato, int anyo, String plataforma) {
        super(titulo, autor, formato, anyo);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Videojuego{" +
                "plataforma='" + plataforma + '\'' +
                '}';
    }
}
