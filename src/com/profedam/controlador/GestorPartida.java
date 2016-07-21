package com.profedam.controlador;

import com.profedam.logic.Dau;
import com.profedam.logic.Jugador;
import com.profedam.logic.Partida;
import com.profedam.vista.Entrada;
import com.profedam.vista.Sortida;
import com.profedam.vista.Vista;

import java.util.ArrayList;

public class GestorPartida {

    Partida partida;
    Vista vista;

    public GestorPartida(Partida partida, Vista vista) {
        this.partida = partida;
        this.vista = vista;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public void jugar()
    {
        partida.setLlistaJugadors(vista.introduirJugadors ());
        partida.jugarPartida();
        vista.imprimirJugadors(partida.getLlistaJugadors());
        partida.calculaGuanyador();
        vista.imprimirGuanyadors(partida.getLlistaJugadors());
    }

    public static void main(String[] args) {
	// write your code here

        Partida partida = new Partida(new Dau(6), new ArrayList<Jugador>());
        Vista vista = new Vista();
        GestorPartida gestor = new GestorPartida(partida, vista);
        gestor.jugar();

    }
}
