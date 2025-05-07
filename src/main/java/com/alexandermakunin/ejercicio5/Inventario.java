package com.alexandermakunin.ejercicio5;

import com.alexandermakunin.ejercicio5.tools.Utilidad;
import com.alexandermakunin.ejercicio5.block.Bloque;
import com.alexandermakunin.ejercicio5.usable.Usable;

import java.util.ArrayList;

public class Inventario {
    private final ArrayList<Objeto> objetos;
    private final int limit;

    public Inventario() {
        objetos = new ArrayList<>();
        limit = 6;
    }

    public boolean add(Bloque bloque) {
        if (objetos.size() > limit) {
            return false;
        } else {
            if (objetos.contains(bloque)) {
                if (bloque.getActualStack() < bloque.getMaxStack()) {
                    bloque.setActualStack(bloque.getActualStack()+1);
                } else {
                    return false;
                }
            } else {
                objetos.add(bloque);
            }
            return true;
        }
    }

    public boolean add(Utilidad Utilidad) {
        if (objetos.size() > limit) {
            return false;
        } else {
            objetos.add(Utilidad);
            return true;
        }
    }

    public boolean add(Usable usable) {
        if (objetos.size() > limit) {
            return false;
        } else {
            if (usable.getMaxStack() < usable.getActualStack()) {
                return false;
            }
            if (objetos.contains(usable)) {
                usable.setActualStack(usable.getActualStack()+1);
            } else {
                objetos.add(usable);
            }
            return true;
        }
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "objetos=" + objetos +
                '}';
    }
}
