package com.alexandermakunin.ejercicio7;

import java.time.LocalDate;
import java.util.Objects;

public class Partido {
    private static int contador = 0;
    private final int id;
    private final Afluencia afluencia;
    private final LocalDate fechaPartido;
    private final String local;
    private final String visitante;

    public Partido(Afluencia afluencia, LocalDate fechaPartido, String local, String visitante) {
        this.id = ++contador;
        this.afluencia = afluencia;
        this.fechaPartido = fechaPartido;
        this.local = local;
        this.visitante = visitante;
        EntradaNormal.getAsientosDisponibles();
    }

    public int getId() {
        return id;
    }

    public Afluencia getAfluencia() {
        return afluencia;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return id == partido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Partido{" +
                "id=" + id +
                ", afluencia=" + afluencia +
                ", fechaPartido=" + fechaPartido +
                ", local='" + local + '\'' +
                ", visitante='" + visitante + '\'' +
                '}';
    }
}
