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

        public Jugador esGuanyador() {
            Jugador guanyador = new Jugador();

            //TO DO  cal determinar qui es el guanyador
            for (Jugador jugador : llistaJugadors) {

                if (jugador.getPuntuacio() > guanyador.getPuntuacio()) {
                    guanyador = jugador;
                }

            }

            return guanyador;
        }

        /*
         TODO només estem suposant un guanyador!! estic provant com funciona el commit sobre un projecte que s'ha fet el checkout previament
         */


    }



