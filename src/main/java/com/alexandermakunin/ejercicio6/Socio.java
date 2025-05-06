package com.alexandermakunin.ejercicio6;

import java.time.LocalDate;
import java.util.Objects;

public class Socio {
    private final String NIF;
    private final String nombre;
    private final LocalDate fechaNac;
    private final String poblacion;

    public Socio(String NIF, String nombre, LocalDate fechaNac, String poblacion) throws Exception {
        this.NIF = NIF;
        this.nombre = nombre;
        mayorDeEdad(fechaNac);
        this.fechaNac = fechaNac;
        this.poblacion = poblacion;
    }

    private void mayorDeEdad(LocalDate fechaNac) throws Exception {
        if (fechaNac.getYear() < 18) {
            throw new Exception("Es menor de edad");
        }
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(NIF, socio.NIF);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(NIF);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "NIF='" + NIF + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                ", poblacion='" + poblacion + '\'' +
                '}';
    }
}
