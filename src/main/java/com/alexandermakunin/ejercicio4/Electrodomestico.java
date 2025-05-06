package com.alexandermakunin.ejercicio4;

public class Electrodomestico {
    private final int precioBasePorDefecto = 100;
    private final String colorPorDefecto = "blanco";
    private final char consumoEnergeticoPorDefecto = 'F';
    private final int pesoPorDefecto = 5;

    private int precioBase = precioBasePorDefecto;
    private String color = colorPorDefecto;
    private char consumoEnergetico = consumoEnergeticoPorDefecto;
    private int peso = pesoPorDefecto;

    public Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A','B','C','D','E','F' -> letra = letra;
            default -> letra = 'F';
        }
    }
    private void comprobarColor(String color) {
        switch (color) {
            case "blanco", "negro", "rojo", "azul", "gris" -> this.color = color;
            default -> color = colorPorDefecto;
        }
    }

    public int precioFinal() {
        int precio = precioBase;
        switch (consumoEnergetico) {
            case 'A' -> precio = precio + 100;
            case 'B' -> precio = precio + 80;
            case 'C' -> precio = precio + 60;
            case 'D' -> precio = precio + 50;
            case 'E' -> precio = precio + 30;
            case 'F' -> precio = precio + 10;
        }
        if (peso > 0 && peso < 20) {
            precio = precio + 10;
        } else if (peso >= 20 && peso < 50) {
            precio = precio + 50;
        } else if (peso >= 50 && peso < 80) {
            precio = precio + 80;
        } else if (peso >= 80) {
            precio = precio + 100;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}