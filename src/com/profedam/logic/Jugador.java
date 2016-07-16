package com.profedam.logic;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Jugador {

    private String nomJugador;

    public Jugador() {
    }

    private int numJugador;
    private int puntuacio;

    public Jugador(int numJugador, String nomJugador) {
        this.nomJugador = nomJugador;
        this.numJugador = numJugador;
    }

    public String getNomJugador() {
        return nomJugador;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public void  imprimirJugador()
    {
       System.out.println ("El jugador " + this.getNomJugador() + "Ha tret un " + this.getPuntuacio());
    }
}

