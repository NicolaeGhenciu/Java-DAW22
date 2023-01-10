package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Juego_PPTV2 {

		public static void main(String[] args) {
			
		int a = 0;
			
		while (a < 50) {
			
		int contador = 0;
		int victorias = 0;
		int derrotas = 0;
		int empates =0;
		
		while (contador < 5) {
			
			++contador;
			
			System.out.println("\nIntroduce una de las 3 opciones: \n\n 1 Para jugar con piedra \n 2 Para jugar con papel \n 3 para jugar con tijeras");
			
			Scanner teclado = new Scanner(System.in);
			int jugador = teclado.nextInt();
			
			int ia = (int)(Math.random()*3)+1;
			
			if (ia==1)
				System.out.println("\nEl ordenador ha sacado piedra");
			if (ia==2)
				System.out.println("\nEl ordenador ha sacado papel");
			if (ia==3)
				System.out.println("\nEl ordenador ha sacado tijeras");
			
			if (jugador==1 && ia==3) {
			System.out.println("\n\tHas ganado!!");
			++victorias; }
			if (jugador==2 && ia==1) {
			System.out.println("\n\tHas ganado!!");
			++victorias; }
			if (jugador==3 && ia==2) {
			System.out.println("\n\tHas ganado!!");
			++victorias; }
			
			if (jugador==1 && ia==2) {
			System.out.println("\n\tHas perdido!!");
			++derrotas; }
			if (jugador==2 && ia==3) {
			System.out.println("\n\tHas perdido!!");
			++derrotas; }
			if (jugador==3 && ia==1) {
			System.out.println("\n\tHas perdido!!");
			++derrotas; }
			
			if (jugador==1 && ia==1) {
			System.out.println("\n\tEmpate");
			++empates; }
			if (jugador==2 && ia==2) {
			System.out.println("\n\tEmpate"); 
			++empates; }
			if (jugador==3 && ia==3) {
			System.out.println("\n\tEmpate");
			++empates; }
			
		}
		
		System.out.println("\tVictorias del jugador:  " + victorias);
		System.out.println("\tVictorias de la I.A:  " + derrotas);
		System.out.println("\tEmpates:  " + empates);
		System.out.println();
		
			}
		}
	}
