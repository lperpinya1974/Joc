package com.profedam.logic;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Jugador implements Comparable  {

    private String nomJugador;

    public Jugador() {
    }

    private int puntuacio;

    public Jugador(int numJugador, String nomJugador) {
        this.nomJugador = nomJugador;
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






    @Override
    public int compareTo(Object o) {

        Jugador jugadorComparable = (Jugador) o;

        return this.getPuntuacio()> jugadorComparable.getPuntuacio()? -1: 1;


    }
}

