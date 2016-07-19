package com.profedam.controlador;

import com.profedam.logic.Dau;
import com.profedam.logic.Jugador;
import com.profedam.logic.Partida;
import com.profedam.vista.Sortida;

import java.util.ArrayList;

public class GestorPartida {

    public static void main(String[] args) {
	// write your code here

        //TODO cal fer la classe entrada que s'encarregi d'inicialitzar això
        Dau dau = new Dau(6);
        ArrayList<Jugador> llistaJugadors = new ArrayList<Jugador>();
        /* Revisar segons la versió de Java pot donar error */

        llistaJugadors.add(new Jugador(1, "Carlota"));
        llistaJugadors.add(new Jugador(2, "Ivan"));
        llistaJugadors.add(new Jugador(3, "Marta"));


        Partida partida = new Partida(dau, llistaJugadors);
        Sortida vista = new Sortida ();
        partida.jugarPartida();
        vista.imprimirJugadors(partida.getLlistaJugadors ());
        partida.calculaGuanyador();
        vista.imprimirGuanyadors(partida.getLlistaGuanyadors());




    }
}
