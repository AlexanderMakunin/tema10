package com.alexandermakunin.ejercicio7;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio7 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Gestion gestion = new Gestion();
    public static void main(String[] args) {
        int opcion;
        do {
            for (String s : menuPrincial) {
                System.out.println(s);
            }
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> crearPartido();
                case 2 -> gestionDeEntradas();
            }
        } while (opcion != 0);
    }
    private static void crearPartido() {
        System.out.println("indique la fecha");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());
        System.out.println("tipo de partido");
        Afluencia tipo = Afluencia.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("nombre del equipo local");
        String local = scanner.nextLine();
        System.out.println("nombre del equipo visitante");
        String visitante = scanner.nextLine();
        gestion.nuevoPartido(fecha,tipo,local,visitante);
    }
    private static void gestionDeEntradas() {
        int opcion;
        do {
            for (String s : menuGestionEntradas) {
                System.out.println(s);
            }
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> crearEntrada();
                case 2 -> devolverEntrada();
                case 3 -> listadoOcupados();
                case 4 -> listadoLibres();
                case 5 -> recaudacion();
            }
        } while (opcion != 0);
    }
    private static void crearEntrada() {
        System.out.println("indique la zona");
        int zona = Integer.parseInt(scanner.nextLine());
        System.out.println("indique la fila");
        int fila = Integer.parseInt(scanner.nextLine());
        System.out.println("indique el numero de asientos");
        int numAsientos = Integer.parseInt(scanner.nextLine());
        gestion.ventaDeEntradas(zona,fila,numAsientos);
    }
    private static void devolverEntrada() {
        System.out.println("indique el id de la entrada");
        int id = Integer.parseInt(scanner.nextLine());
        gestion.devolverEntrada(id);
    }
    private static void listadoOcupados() {
        Asiento[] asientos = gestion.listadoOcupados();
        for (Asiento asiento : asientos) {
            System.out.println(asiento);
        }
    }
    private static void listadoLibres() {
        Asiento[] asientos = gestion.listadoLibre();
        for (Asiento asiento : asientos) {
            System.out.println(asiento);
        }
    }
    private static void recaudacion() {
        System.out.println(gestion.recaudacion());
    }
    private static final String[] menuPrincial = new String[]{
        "1.Nuevo partido",
        "2.Gestión de entradas",
        "0.Salir"
    };
    private static final String[] menuGestionEntradas = new String[] {
            "1.Venta de entradas",
            "2.Devolver una entrada",
            "3.Listado de localidades ocupadas",
            "4.Listado de localidades libres",
            "5.Mostrar recaudación del partido",
            "0. Volver al menú principal"
    };

}
