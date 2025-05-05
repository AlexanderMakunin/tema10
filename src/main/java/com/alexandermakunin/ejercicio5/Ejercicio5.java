package com.alexandermakunin.ejercicio5;

import com.alexandermakunin.ejercicio5.usable.*;
import com.alexandermakunin.ejercicio5.block.*;
import com.alexandermakunin.ejercicio5.tools.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Pico pico = new Pico("pico",100,2);
        Espada espada = new Espada("espada",100,5);
        Piedra piedra = new Piedra("piedra");
        Madera madera = new Madera("madera");
        Ender ender = new Ender("ender");
        Huevo huevo = new Huevo("huevo");
        inventario.add(pico);
        inventario.add(espada);
        inventario.add(piedra);
        inventario.add(madera);
        inventario.add(huevo);
        inventario.add(ender);
        System.out.println(inventario);
    }
}
