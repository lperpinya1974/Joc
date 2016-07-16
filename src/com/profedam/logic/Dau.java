package com.profedam.logic;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Dau {
    private int numeroCares;

    public Dau(int numeroCares) {
        this.numeroCares = numeroCares;
    }

    public int getNumeroCares() {
        return numeroCares;
    }

    public void setNumeroCares(int numeroCares) {
        this.numeroCares = numeroCares;
    }

    public int tirarDau()
    {
        return (int) (Math.random() * numeroCares + 1);
    }

}
