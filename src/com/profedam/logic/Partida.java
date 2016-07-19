package com.profedam.logic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Partida {

    private Dau dau;
    private ArrayList<Jugador> llistaJugadors;
    private ArrayList<Jugador> llistaGuanyadors;
    ArrayList<Jugador> prova;

    public Partida(Dau dau, ArrayList<Jugador> llistaJugadors) {
        this.dau = dau;
        this.llistaJugadors = llistaJugadors;
    }

    public void jugarPartida() {
        for (Jugador jugador : llistaJugadors) {
            jugador.setPuntuacio (dau.tirarDau ( ));

        }
    }

    public void calculaGuanyador() {

        llistaGuanyadors = new ArrayList();
        Collections.sort (llistaJugadors);
        int puntuacioMaxima = llistaJugadors.get (0).getPuntuacio ( );

        for (Jugador jugador : llistaJugadors) {
            if (jugador.getPuntuacio ( ) == puntuacioMaxima) llistaGuanyadors.add (jugador);
        }

    }

    public ArrayList<Jugador> getLlistaJugadors() {
        return llistaJugadors;
    }

    public void setLlistaJugadors(ArrayList<Jugador> llistaJugadors) {
        this.llistaJugadors = llistaJugadors;
    }

    public ArrayList<Jugador> getLlistaGuanyadors() {
        return llistaGuanyadors;
    }

    public void setLlistaGuanyadors(ArrayList<Jugador> llistaGuanyadors) {
        this.llistaGuanyadors = llistaGuanyadors;
    }
}







