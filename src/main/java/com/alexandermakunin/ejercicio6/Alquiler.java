package com.alexandermakunin.ejercicio6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Alquiler {
    private final Multimedia multimedia;
    private final Socio socio;
    private int precio = 4;
    private boolean devuelto = false;
    private boolean cargoPendiente = false;
    private final LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler(Multimedia multimedia, Socio socio) {
        this.multimedia = multimedia;
        this.socio = socio;
        if (multimedia instanceof Pelicula && multimedia.getAnyo() < 2012 || multimedia instanceof Videojuego && multimedia.getAnyo() < 2010) {
            precio -= 1;
        }
        this.fechaAlquiler = LocalDate.now();
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public Socio getSocio() {
        return socio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public boolean isCargoPendiente() {
        return cargoPendiente;
    }

    public void setCargoPendiente(boolean cargoPendiente) {
        this.cargoPendiente = cargoPendiente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alquiler alquiler = (Alquiler) o;
        return precio == alquiler.precio && devuelto == alquiler.devuelto && cargoPendiente == alquiler.cargoPendiente && Objects.equals(multimedia, alquiler.multimedia) && Objects.equals(socio, alquiler.socio) && Objects.equals(fechaAlquiler, alquiler.fechaAlquiler) && Objects.equals(fechaDevolucion, alquiler.fechaDevolucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multimedia, socio, precio, devuelto, cargoPendiente, fechaAlquiler, fechaDevolucion);
    }

    public void devolucion() {
        devuelto = true;
        fechaDevolucion = LocalDate.now();
        long diferencia = ChronoUnit.DAYS.between(fechaAlquiler,fechaDevolucion);
        if (diferencia > 3) {
            cargoPendiente = true;
            for (int i = 3; i < diferencia; i++) {
                precio += 2;
            }
        }
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "multimedia=" + multimedia +
                ", socio=" + socio +
                ", precio=" + precio +
                ", devuelto=" + devuelto +
                ", pagarPrePago=" + cargoPendiente +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
