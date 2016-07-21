package com.profedam.vistatext;

import com.profedam.logic.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lluis Maria on 19/07/2016.
 */
public class Entrada {

    public ArrayList<Jugador> introduirJugadors ()
    {
        ArrayList<Jugador> llistaJugadors = new ArrayList<Jugador>();
        String entrada;
        Scanner in = new Scanner (System.in);
do
        {
            System.out.println ("Introdueix jugador:");
                    entrada = in.nextLine();

           if (!entrada.isEmpty()) llistaJugadors.add(new Jugador(entrada));

        }
        while (!entrada.isEmpty());

       return llistaJugadors;
    }
}
