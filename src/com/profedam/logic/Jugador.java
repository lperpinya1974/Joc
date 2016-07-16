package com.profedam.logic;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Jugador {

    private String nomJugador;
    private int numJugador;

    public Jugador(int numJugador, String nomJugador) {
        this.nomJugador = nomJugador;
        this.numJugador = numJugador;
    }

    public String getNomJugador() {
        return nomJugador;
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
}
}
