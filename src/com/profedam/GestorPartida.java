package com.profedam;

import com.profedam.logic.Dau;
import com.profedam.logic.Jugador;
import com.profedam.logic.Partida;

public class GestorPartida {

    public static void main(String[] args) {
	// write your code here

        Dau dau = new Dau(6);
        Jugador[] llistaJugadors = {new Jugador (1, "Pepe"), new Jugador(2, "Carlota"), new Jugador(3, "Ivan")};
        Partida partida = new Partida(dau, llistaJugadors);
        partida.jugarPartida();
        partida.imprimirJugadors();
        partida.calculaGuanyador();
        partida.imprimirGuanyadors();


    }
}
