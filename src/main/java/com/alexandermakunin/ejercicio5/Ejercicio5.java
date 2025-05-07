package com.alexandermakunin.ejercicio5;

import com.alexandermakunin.ejercicio5.entity.Entity;
import com.alexandermakunin.ejercicio5.entity.Zombie;
import com.alexandermakunin.ejercicio5.usable.*;
import com.alexandermakunin.ejercicio5.block.*;
import com.alexandermakunin.ejercicio5.tools.*;

import java.awt.event.FocusAdapter;

public class Ejercicio5 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Pico picoDePiedra = new Pico("pico de piedra",100,2);
        Pico picoDeMadera = new Pico("pico de madera",100,2);
        Entity entity = new Zombie(100,"zombie");
        Espada espada = new Espada("espada",100,5);
        Piedra piedra = new Piedra("piedra");
        Madera madera = new Madera("madera");
        Ender ender = new Ender("ender");
        Huevo huevo = new Huevo("huevo");
        inventario.add(picoDePiedra);
        inventario.add(espada);
        inventario.add(piedra);
        inventario.add(madera);
        inventario.add(huevo);
        for (int i = 0; i < 66; i++) {
            inventario.add(piedra);
        }
        for (int i = 0; i < 18; i++) {
            inventario.add(ender);
        }
        inventario.add(picoDeMadera);
        inventario.add(picoDePiedra);
        inventario.add(picoDePiedra);
        System.out.println(inventario);
        picoDePiedra.minar(madera);
        espada.golpear(entity);
        System.out.println(inventario);
        System.out.println(entity);
    }
}
