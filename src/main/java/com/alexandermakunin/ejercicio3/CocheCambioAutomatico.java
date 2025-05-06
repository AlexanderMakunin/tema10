package com.alexandermakunin.ejercicio3;

public class CocheCambioAutomatico extends Coche {
    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public void acelerar(int velocidad) {
        if (super.getMarchas()[super.getMarchaActual()] < velocidad && super.getMarchas().length < super.getMarchaActual()) {
            for (int i = super.getMarchaActual(); super.getMarchas()[super.getMarchaActual()] < velocidad;i++) {
                if (super.getMarchaActual() == super.getMarchas().length) {
                    break;
                }
                super.setMarchaActual(i);
            }
        } else {
            super.setMarchaActual(super.getMarchas().length);
            super.setVelocidadActual(super.getMarchas()[super.getMarchaActual()-1]);
        }
    }

    @Override
    public void frenar(int velocidad) {
        if (super.getMarchas()[getMarchaActual()] > velocidad) {
            for (int i = super.getMarchaActual(); super.getMarchas()[super.getMarchaActual()-1] > velocidad;i++) {
                if (super.getMarchaActual() == 0) {
                    break;
                }
                super.setMarchaActual(i);
            }
        }
    }
}
