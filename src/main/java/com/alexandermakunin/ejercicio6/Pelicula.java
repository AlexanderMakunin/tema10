package com.alexandermakunin.ejercicio6;

import java.time.LocalDate;

public class Pelicula extends Multimedia {
    private float duracion;
    private String autorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, int anyo, float duracion, String autorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, anyo);
        this.duracion = duracion;
        this.autorPrincipal = autorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pelicula{" +
                "duracion=" + duracion +
                ", autorPrincipal='" + autorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                '}';
    }
}
