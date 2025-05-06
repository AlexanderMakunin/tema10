package com.alexandermakunin.ejercicio4;

public class Lavadora extends Electrodomestico {
    private final int cargaPorDefecto = 5;
    private int carga = cargaPorDefecto;

    public Lavadora() {
        super();
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int precio = super.precioFinal();
        if (carga >= 30) {
            precio= precio + 50;
        }
        return precio;
    }
}
