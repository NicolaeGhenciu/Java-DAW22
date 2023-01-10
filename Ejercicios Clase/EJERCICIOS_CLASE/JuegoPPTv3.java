package EJERCICIOS_CLASE;

import java.util.Scanner;

public class JuegoPPTv3 {

	public static void main(String[] args) {

		int puntosMaquina = 0;
		int puntosJugador = 0;
		int empatesEpicos = 0;

		int papelia = 0;
		int tijerasia = 0;
		int piedraia = 0;

		while (true != false) {

			int contador = 0;

			int victorias = 0;
			int derrotas = 0;
			int empates = 0;

			while (contador < 5) {

				++contador;

				System.out.println(
						"\nIntroduce una de las 3 opciones: \n\n 1 Para jugar con piedra \n 2 Para jugar con papel \n 3 para jugar con tijeras");

				Scanner teclado = new Scanner(System.in);
				int jugador = teclado.nextInt();

				int ia = (int) (Math.random() * 3) + 1;

				if (ia == 1) {
					System.out.println("\nEl ordenador ha sacado piedra");
					piedraia++;
				}

				if (ia == 2) {
					System.out.println("\nEl ordenador ha sacado papel");
					papelia++;
				}

				if (ia == 3) {
					System.out.println("\nEl ordenador ha sacado tijeras");
					tijerasia++;
				}

				if (jugador == 1 && ia == 3) {
					System.out.println("\n\tHas ganado!!");
					++victorias;
				}
				if (jugador == 2 && ia == 1) {
					System.out.println("\n\tHas ganado!!");
					++victorias;
				}
				if (jugador == 3 && ia == 2) {
					System.out.println("\n\tHas ganado!!");
					++victorias;
				}

				if (jugador == 1 && ia == 2) {
					System.out.println("\n\tHas perdido!!");
					++derrotas;
				}
				if (jugador == 2 && ia == 3) {
					System.out.println("\n\tHas perdido!!");
					++derrotas;
				}
				if (jugador == 3 && ia == 1) {
					System.out.println("\n\tHas perdido!!");
					++derrotas;
				}

				if (jugador == 1 && ia == 1) {
					System.out.println("\n\tEmpate");
					++empates;
				}
				if (jugador == 2 && ia == 2) {
					System.out.println("\n\tEmpate");
					++empates;
				}
				if (jugador == 3 && ia == 3) {
					System.out.println("\n\tEmpate");
					++empates;
				}

			}

			if (victorias < derrotas)
				++puntosMaquina;

			if (victorias > derrotas)
				++puntosJugador;

			if (victorias == derrotas)
				++empatesEpicos;

			System.out.println("\tChampions Jugador: " + puntosJugador);
			System.out.println("\tChampions de la I.A: " + puntosMaquina);
			System.out.println("\tChampions Empatadas Epicamente :" + empatesEpicos);
			System.out.println("\n\tVictorias del jugador:  " + victorias);
			System.out.println("\tVictorias de la I.A:  " + derrotas);
			System.out.println("\tEmpates:  " + empates);
			System.out.println("");
			System.out.println("Piedra ia:" + piedraia);
			System.out.println("Tijeras ia: " + tijerasia);
			System.out.println("Papel ia:" + papelia);

		}
	}
}
