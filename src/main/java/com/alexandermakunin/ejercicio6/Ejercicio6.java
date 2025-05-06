package com.alexandermakunin.ejercicio6;

import java.util.Scanner;

import io.github.regychang.java.faker.*;

public class Ejercicio6 {
    private static final GestionMultimedia gestionMultimedia = new GestionMultimedia();
    private static final Scanner scanner = new Scanner(System.in);
    private static final Faker faker = new Faker();

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

    public static void main(String[] args) {
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i+1) + "." + opciones[i]);
        }
        int opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1 -> altas();
            //case 2 -> alquilarMultimedia();
            //case 3 -> devolverMultimedia();
            case 4 -> listados();
        }
    }
    public static void altas() {
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i+1) + "." + altas[i]);
        }
        int opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1 -> nuevaPelicula();
            case 2 -> nuevoVideojuego();
            //case 3 -> ;
            //case 4 -> ;
        }
    }
    public static void nuevaPelicula() {
        System.out.println("Indique el titulo");
        String titulo = scanner.nextLine();
        System.out.println("Indique el titulo");
        String autor = scanner.nextLine();
        System.out.println("Indique el titulo");
        Formato formato = Formato.valueOf(scanner.nextLine());
        System.out.println("Indique el titulo");
        int anyo = Integer.parseInt(scanner.nextLine());
        System.out.println("Indique el titulo");
        float duracion = Float.parseFloat(scanner.nextLine());
        System.out.println("Indique el titulo");
        String autorPrincipal = scanner.nextLine();
        System.out.println("Indique el titulo");
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
        System.out.println("Indique el titulo");
        float duracion = Float.parseFloat(scanner.nextLine());
        System.out.println("Indique el titulo");
        String autorPrincipal = scanner.nextLine();
        System.out.println("Indique el titulo");
        String actrizPrincipal = scanner.nextLine();
        boolean anyadido = gestionMultimedia.anyadirPeli(new Pelicula(titulo,autor,formato,anyo,duracion,autorPrincipal,actrizPrincipal));
        if (anyadido) {
            System.out.println("Se ha añadido exitosamente");
        } else {
            System.out.println("Hubo un error");
        }
    }
    public static void listados() {}
}
