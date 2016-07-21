package com.profedam.vista;

import com.profedam.controlador.GestorPartida;
import com.profedam.logic.Jugador;

import java.util.ArrayList;

/**
 * Created by Lluis Maria on 21/07/2016.
 */
public interface InterficieVista {

    public ArrayList<Jugador> introduirJugadors();
   // public void setControlador(GestorPartida gestor);
    public Jugador nouJugador();
    public void imprimirJugadors (ArrayList<Jugador> llistaJugadors);
    public void imprimirGuanyadors (ArrayList<Jugador> llistaGuanyadors);


}
