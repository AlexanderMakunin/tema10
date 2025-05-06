package com.alexandermakunin.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

import io.github.regychang.java.faker.*;

public class Ejercicio6 {
    private static final GestionMultimedia gestionMultimedia = new GestionMultimedia();
    private static final Scanner scanner = new Scanner(System.in);

    private static final String[] altas = new String[]{
            "Altas",
            "Alta de una nueva Película",
            "Alta de un nuevo Videojuego",
            "Alta de un nuevo socio"
    };
    private static final String[] opciones = new String[]{
            "Altas",
            "Alquilar multimedia",
            "Devolver multimedia",
            "Listados"
    };
    private static final String[] listados = new String[]{
            "Listados",
            "• Listado de todos los objetos multimedia",
            "• Listado de todas las películas ordenadas por título",
            "• Listado de todos los videojuegos ordenados por año",
            "• Listado del histórico de alquileres de un socio ordenados por fecha de alquiler",
            "• Listado de los alquileres actuales de un socio",
            "• Listado de los socios con recargos pendientes"
    };

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i+1) + "." + opciones[i]);
        }
        int opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1 -> altas();
            case 2 -> alquilarMultimedia();
            case 3 -> devolverMultimedia();
            case 4 -> listados();
        }
    }
    public static void altas() throws Exception {
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i+1) + "." + altas[i]);
        }
        int opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1 -> nuevaPelicula();
            case 2 -> nuevoVideojuego();
            case 3 -> nuevoSocio();
        }
    }
    public static void nuevaPelicula() {
        System.out.println("Indique el titulo");
        String titulo = scanner.nextLine();
        System.out.println("Indique el autor");
        String autor = scanner.nextLine();
        System.out.println("Indique el formato");
        Formato formato = Formato.valueOf(scanner.nextLine());
        System.out.println("Indique el anyo");
        int anyo = Integer.parseInt(scanner.nextLine());
        System.out.println("Indique el duracion");
        float duracion = Float.parseFloat(scanner.nextLine());
        System.out.println("Indique el autor principal");
        String autorPrincipal = scanner.nextLine();
        System.out.println("Indique el actriz principal");
        String actrizPrincipal = scanner.nextLine();
        boolean anyadido = gestionMultimedia.anyadirPeli(new Pelicula(titulo,autor,formato,anyo,duracion,autorPrincipal,actrizPrincipal));
        if (anyadido) {
            System.out.println("Se ha añadido exitosamente");
        } else {
            System.out.println("Hubo un error");
        }
    }
    public static void nuevoVideojuego() {
        System.out.println("Indique el titulo");
        String titulo = scanner.nextLine();
        System.out.println("Indique el titulo");
        String autor = scanner.nextLine();
        System.out.println("Indique el titulo");
        Formato formato = Formato.valueOf(scanner.nextLine());
        System.out.println("Indique el titulo");
        int anyo = Integer.parseInt(scanner.nextLine());
        System.out.println("Indique el plataforma");
        String plataforma = scanner.nextLine();
        boolean anyadido = gestionMultimedia.anyadirPeli(new Videojuego(titulo,autor,formato,anyo,plataforma));
        if (anyadido) {
            System.out.println("Se ha añadido exitosamente");
        } else {
            System.out.println("Hubo un error");
        }
    }
    public static void nuevoSocio() throws Exception {
        System.out.println("Indique el NIF");
        String NIF = scanner.nextLine();
        System.out.println("Indique el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Indique el fecha");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());
        System.out.println("Indique el poblacion");
        String poblacion = scanner.nextLine();
        boolean anyadido = gestionMultimedia.anyadirSocio(new Socio(NIF,nombre,fecha,poblacion));
        if (anyadido) {
            System.out.println("se ha añadido exitosamente");
        } else {
            System.out.println("Hubo un error");
        }
    }
    public static void alquilarMultimedia() {
        System.out.println("Indique el nombre de la multimedia");
        String multimedia = scanner.nextLine();
        Multimedia multimediaEncontrado = null;
        for (Multimedia multimediaBuscado : gestionMultimedia.getMultimedias()) {
            if (multimediaBuscado.getTitulo().equals(multimedia)) {
                multimediaEncontrado = multimediaBuscado;
            }
        }
        System.out.println("Indique el nif");
        String nif = scanner.nextLine();
        Socio socioBuscado = null;
        for (Socio socio : gestionMultimedia.getSocios()) {
            if (socio.getNIF().equals(nif)) {
                socioBuscado = socio;
            }
        }
        if (gestionMultimedia.alquilar(multimediaEncontrado,socioBuscado)) {
            System.out.println("alquiler creado");
        } else {
            System.out.println("hubo un error");
        }
    }
    public static void devolverMultimedia() {
        System.out.println("Indique el nombre de la multimedia");
        String multimedia = scanner.nextLine();
        Multimedia multimediaEncontrado = null;
        for (Multimedia multimediaBuscado : gestionMultimedia.getMultimedias()) {
            if (multimediaBuscado.getTitulo().equals(multimedia)) {
                multimediaEncontrado = multimediaBuscado;
            }
        }
        System.out.println("Indique el nif");
        String nif = scanner.nextLine();
        Socio socioBuscado = null;
        for (Socio socio : gestionMultimedia.getSocios()) {
            if (socio.getNIF().equals(nif)) {
                socioBuscado = socio;
            }
        }
        Alquiler alquilerBuscado = null;
        boolean encontrado = false;
        for (Alquiler alquiler : gestionMultimedia.getAlquileres()) {
            if (alquiler.getSocio().equals(socioBuscado) && alquiler.getMultimedia().equals(multimediaEncontrado)) {
                alquilerBuscado = alquiler;
                encontrado = true;
                break;
            }
        }
        if (alquilerBuscado == null) {
            System.out.println("no se ha encontrado");
        } else if (encontrado) {
            gestionMultimedia.devoler(alquilerBuscado);
            System.out.println("alquiler devuelto");
        } else {
            System.out.println("hubo un error");
        }
    }
    public static void listados() {
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i+1) + "." + listados[i]);
        }
        int opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1 -> listaMultimedia();
            case 2 -> listaPeliculas();
            case 3 -> listaVideojuegos();
            case 4 -> alquileresDeUnSocio();
            case 5 -> alquileresActualDeUnSocio();
            case 6 -> cargoPendiente();
        }
    }
    public static void listaMultimedia() {
        for (Multimedia multimedia : gestionMultimedia.getMultimedias()) {
            System.out.println(multimedia);
        }
    }
    public static void listaPeliculas() {
        for (Pelicula pelicula : gestionMultimedia.peliculasPorNombreAlfabetico()) {
            System.out.println(pelicula);
        }
    }
    public static void listaVideojuegos() {
        for (Videojuego videojuego : gestionMultimedia.videojuegosPorAnyo()) {
            System.out.println(videojuego);
        }
    }
    public static void alquileresDeUnSocio() {
        System.out.println("Indique el nif");
        String nif = scanner.nextLine();
        Socio socioBuscado = null;
        for (Socio socio : gestionMultimedia.getSocios()) {
            if (socio.getNIF().equals(nif)) {
                socioBuscado = socio;
            }
        }
        for (Alquiler alquiler : gestionMultimedia.listaAlquileresDeUnSocio(socioBuscado)) {
            System.out.println(alquiler);
        }
    }
    public static void alquileresActualDeUnSocio() {
        System.out.println("Indique el nif");
        String nif = scanner.nextLine();
        Socio socioBuscado = null;
        for (Socio socio : gestionMultimedia.getSocios()) {
            if (socio.getNIF().equals(nif)) {
                socioBuscado = socio;
            }
        }
        for (Alquiler alquiler : gestionMultimedia.alquileresDeUnSocio(socioBuscado)) {
            System.out.println(alquiler);
        }
    }
    public static void cargoPendiente() {
        for (Socio socio : gestionMultimedia.cargosPendientes()) {
            System.out.println(socio);
        }
    }
}
