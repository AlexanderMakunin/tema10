package com.alexandermakunin.ejercicio3;

public class CocheCambioManual extends Coche {
    public CocheCambioManual(String matricula) {
        super(matricula);
    }

    @Override
    protected void cambiarMarcha(int marcha) {
        if (marcha >= 0 && super.getMarchas().length > marcha && super.getMarchas().length < marcha) {
            super.setMarchaActual(marcha);
        }
    }
}
