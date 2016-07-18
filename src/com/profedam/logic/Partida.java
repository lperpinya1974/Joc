package com.profedam.logic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Partida {

    private Dau dau;
    private ArrayList<Jugador> llistaJugadors;
    ArrayList <Jugador>  prova;

    public Partida(Dau dau, ArrayList<Jugador> llistaJugadors) {
        this.dau = dau;
        this.llistaJugadors = llistaJugadors;
    }

    public void jugarPartida() {
        for (Jugador jugador : llistaJugadors) {
            jugador.setPuntuacio(dau.tirarDau());

        }
    }

        public void calculaGuanyador() {

           Collections.sort(llistaJugadors);


           }




        public void imprimirJugadors ()
        {
            for (Jugador jugador: llistaJugadors)
            {
                jugador.imprimirPuntuacio();

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void imprimirGuanyadors ()
        {
                  int puntuacioMaxima = llistaJugadors.get(0).getPuntuacio();


            System.out.println ("El guanyador ha estat");
            for (Jugador jugador: llistaJugadors)
            {
                if ( jugador.getPuntuacio()!=puntuacioMaxima) break;
                jugador.imprimirJugador();

            }


        }


    }



