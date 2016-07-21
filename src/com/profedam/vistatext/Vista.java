package com.profedam.vistatext;

import com.profedam.logic.Jugador;

import java.util.ArrayList;

/**
 * Created by Lluis Maria on 21/07/2016.
 */
public class Vista implements InterficieVista{

    Entrada entrada;
    Sortida sortida;

    public Vista() {
        this.entrada = new Entrada();
        this.sortida = new Sortida();
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Sortida getSortida() {
        return sortida;
    }

    public void setSortida(Sortida sortida) {
        this.sortida = sortida;
    }

    @Override
    public ArrayList<Jugador> introduirJugadors() {
        return entrada.introduirJugadors();
    }

    @Override
    public Jugador nouJugador() {
        return null;
    }

    @Override
    public void imprimirJugadors(ArrayList<Jugador> llistaJugadors) {

        sortida.imprimirJugadors(llistaJugadors);

    }

    @Override
    public void imprimirGuanyadors(ArrayList<Jugador> llistaGuanyadors) {

        sortida.imprimirGuanyadors(llistaGuanyadors);

    }
}
