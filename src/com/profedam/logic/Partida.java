package com.profedam.logic;

/**
 * Created by Lluis_2 on 16/07/2016.
 */
public class Partida {

    private Dau dau;
    private Jugador[] llistaJugadors, llistaGuanyadors;

    public Partida(Dau dau, Jugador[] llistaJugadors) {
        this.dau = dau;
        this.llistaJugadors = llistaJugadors;
    }

    public void jugarPartida() {
        for (Jugador jugador : llistaJugadors) {
            jugador.setPuntuacio(dau.tirarDau());

        }
    }

        public void calculaGuanyador() {

            llistaGuanyadors = new Jugador[this.llistaJugadors.length];
            int numGuanyador = 0;
            int puntuacioMaxima = 0;




            for (Jugador jugador : llistaJugadors) {

                if (jugador.getPuntuacio() > puntuacioMaxima) {
                    puntuacioMaxima = jugador.getPuntuacio();
                  }

            }
            for (Jugador jugador: llistaJugadors) {

                if (jugador.getPuntuacio() == puntuacioMaxima)
                    llistaGuanyadors[numGuanyador] = jugador;
                numGuanyador++;
            }

        }

        public void imprimirJugadors ()
        {
            for (Jugador jugador: llistaJugadors)
            {
                jugador.imprimirJugador();

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void imprimirGuanyadors ()
        {

            //Sempre dona error al imprimir cal arreglar-ho!!
            if (llistaGuanyadors.length > 1)

                System.out.println ("Els guanyadors han estat");

            else
                System.out.println ("El guanyador ha estat");

            for (Jugador jugador: llistaGuanyadors)
            {
               System.out.println (jugador.getNomJugador());
            }
        }


    }



