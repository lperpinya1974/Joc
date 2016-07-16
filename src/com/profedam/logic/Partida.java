package com.profedam.logic;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Partida {

    private Dau dau;
    private Jugador[] llistaJugadors;

    public Partida(Dau dau, Jugador[] llistaJugadors) {
        this.dau = dau;
        this.llistaJugadors = llistaJugadors;
    }

    public void jugarPartida() {
        for (Jugador jugador : llistaJugadors) {
            jugador.setPuntuacio(dau.tirarDau());
            System.out.println("El jugador " + jugador.getNomJugador() + " ha obtingut un " + jugador.getPuntuacio());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public void esGuanyador()
    {
        //TO DO  cal determinar qui es el guanyador
    }

    }

