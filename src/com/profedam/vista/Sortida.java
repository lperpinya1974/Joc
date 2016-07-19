package com.profedam.vista;

import com.profedam.logic.Jugador;

import java.util.ArrayList;

/**
 * Created by Lluis Maria on 19/07/2016.
 */
public class Sortida {


    public void imprimirJugadors (ArrayList<Jugador> llistaJugadors)
    {
        for (Jugador jugador: llistaJugadors)
        {
            imprimirPuntuacio(jugador);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void imprimirGuanyadors (ArrayList<Jugador> llistaJugadors)

    {
        System.out.println ("Llista de guanyadors amb la tirada màxima: ");
        imprimirJugadors(llistaJugadors);
    }

    public void  imprimirJugador(Jugador jugador)
    {
        System.out.println (jugador.getNomJugador());
    }
    public void imprimirPuntuacio(Jugador jugador)
    {
        System.out.println ("El jugador " + jugador.getNomJugador() + " ha tret un " + jugador.getPuntuacio());
    }

}

