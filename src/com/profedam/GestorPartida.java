package com.profedam;

import com.profedam.logic.Dau;
import com.profedam.logic.Jugador;
import com.profedam.logic.Partida;

import java.util.ArrayList;

public class GestorPartida {

    public static void main(String[] args) {
	// write your code here

        Dau dau = new Dau(6);
        ArrayList<Jugador> llistaJugadors = new ArrayList<Jugador>();
        /* Revisar segons la versió de Java pot donar error */

        llistaJugadors.add(new Jugador(1, "Carlota"));
        llistaJugadors.add(new Jugador(2, "Ivan"));
        llistaJugadors.add(new Jugador(3, "Marta"));


        Partida partida = new Partida(dau, llistaJugadors);
        partida.jugarPartida();
        partida.imprimirJugadors();
        partida.calculaGuanyador();
        partida.imprimirGuanyadors();


    }
}
