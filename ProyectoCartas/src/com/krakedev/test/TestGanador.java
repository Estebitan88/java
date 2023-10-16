package com.krakedev.test;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;

public class TestGanador {

	public static void main(String[] args) {

		ArrayList<String> jugadores = new ArrayList<>();
        jugadores.add("Jugador1");
        jugadores.add("Jugador2");
        jugadores.add("Jugador3");

        // Crear una instancia de Juego y entregar cartas
        Juego juego = new Juego(jugadores);
        juego.entregarCartas(5); // Entrega 5 cartas a cada jugador (ajusta esto según tus necesidades)

        // Imprimir el total de cada jugador
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Total de " + jugadores.get(i) + ": " + juego.devolverTotal(i));
        }

        int idGanador = juego.determinarGanador();
        System.out.println("El ganador es: " + jugadores.get(idGanador));
    }

}