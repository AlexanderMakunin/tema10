package com.alexandermakunin.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class GestionMultimedia {
    private final ArrayList<Multimedia> multimedias = new ArrayList<>();
    private final ArrayList<Socio> socios = new ArrayList<>();
    private final ArrayList<Alquiler> alquileres = new ArrayList<>();
    public GestionMultimedia() {}

    public boolean anyadirPeli(Multimedia multimedia) {
        if (multimedias.add(multimedia)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean anyadirSocio(Socio socio) {
        if (socios.add(socio)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Alquilar(Multimedia multimedia, Socio socio) {
        for (Socio socio1 : socios) {
            if (socio1.equals(socio)) {
                for (Alquiler alquiler : alquileres) {
                    if (alquiler.isCargoPendiente() && alquiler.getSocio() == socio) {
                        return false;
                    }
                }
                alquileres.add(new Alquiler(multimedia,socio));
                return true;
            }
        }
        return false;
    }
    public void Devoler(Alquiler alquiler) {alquiler.devolucion();}
    public ArrayList<Multimedia> listadoMultimedo() {
        return multimedias;
    }
    public ArrayList<Pelicula> peliculasPorNombreAlfabetico() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        for (Multimedia multimedia : multimedias) {
            if (multimedia instanceof Pelicula) {
                peliculas.add((Pelicula) multimedia);
            }
        }
        int alfabeto = 64;
        ArrayList<Pelicula> peliculasOrdenadas = new ArrayList<>();
        for (int i = 0; i < peliculas.size();i++) {
            for (int j = 0; i < peliculas.size();j++) {
                if (peliculas.get(j).getTitulo().charAt(0) == alfabeto) {
                    peliculasOrdenadas.add(peliculas.get(j));
                }
            }
            alfabeto++;
        }
        return peliculasOrdenadas;
    }
    public ArrayList<Videojuego> videojuegosPorAnyo() {
        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        int minAnyo = videojuegos.get(0).getAnyo();
        for (Multimedia videojuego : multimedias) {
            if (videojuego instanceof Videojuego) {
                videojuegos.add((Videojuego) videojuego);
                if (videojuego.getAnyo() < minAnyo) {
                    minAnyo = videojuego.getAnyo();
                }
            }
        }
        ArrayList<Videojuego> videojuegosOrdenadas = new ArrayList<>();

        for (int i = 0; i < videojuegos.size();i++) {
            for (int j = 0; i < videojuegos.size();j++) {
                if (videojuegos.get(j).getAnyo() < minAnyo) {
                    videojuegosOrdenadas.add(videojuegos.get(j));
                }
            }
            minAnyo++;
        }
        return videojuegosOrdenadas;
    }
    public ArrayList<Alquiler> listaAlquileres() {
        LocalDate fecha = alquileres.get(alquileres.size()).getFechaAlquiler();
        for (Alquiler alquiler : alquileres) {
            if (fecha.isAfter(alquiler.getFechaAlquiler())) {
                fecha = alquiler.getFechaAlquiler();
            }
        }
        ArrayList<Alquiler> alquilers = new ArrayList<>();
        for (int i = 0; i < alquileres.size(); i++) {
            for (int j = 0; i < alquileres.size(); j++) {
                if (alquileres.get(j).getFechaAlquiler().isEqual(fecha)) {
                    alquilers.add(alquilers.get(j));
                }
            }
            fecha.plusDays(1);
        }
        return alquilers;
    }
    public ArrayList<Alquiler> alquileresDeUnSocio(Socio socio) {
        ArrayList<Alquiler> alquilers = new ArrayList<>();
        for (Socio socio1 : socios) {
            if (socio1.equals(socio)) {
                for (Alquiler alquiler : alquileres) {
                    if (!alquiler.isDevuelto() && alquiler.getSocio().equals(socio)) {
                        alquilers.add(alquiler);
                    }
                }
            }
            break;
        }
        return alquilers;
    }

    public ArrayList<Socio> cargosPendientes() {
        ArrayList<Socio> socioConCargoPendientes = new ArrayList<>();
        for (Alquiler alquiler : alquileres) {
            if (!alquiler.isDevuelto() && alquiler.isCargoPendiente()) {
                socioConCargoPendientes.add(alquiler.getSocio());
            }
        }
        return socioConCargoPendientes;
    }
}
