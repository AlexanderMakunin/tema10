package com.alexandermakunin.ejercicio4;

public class Television extends Electrodomestico {
    private final double resolucionPorDefecto = 20;
    private final boolean smartTVPorDefecto = false;
    private double resolucion = resolucionPorDefecto;
    private boolean smartTV = smartTVPorDefecto;

    public Television() {
        super();
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int carga, double resolucion, boolean smartTV) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    @Override
    public int precioFinal() {
        int precio = super.precioFinal();
        if (resolucion > 40) {
            precio += (precio * 30)/100;
        }
        if (smartTV) {
            precio = precio + 50;
        }
        return precio;
    }
}
