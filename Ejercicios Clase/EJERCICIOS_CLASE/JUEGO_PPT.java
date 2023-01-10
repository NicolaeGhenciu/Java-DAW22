package EJERCICIOS_CLASE;

import java.util.Scanner;

public class JUEGO_PPT {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce una de las 3 opciones: \n\n 1 Para jugar con piedra \n 2 Para jugar con papel \n 3 para jugar con tijeras");
		
		Scanner teclado = new Scanner(System.in);
		int jugador = teclado.nextInt();
		
		int ia = (int)(Math.random()*3)+1;
		
		if (ia==1)
			System.out.println("El ordenador ha sacado piedra");
		if (ia==2)
			System.out.println("El ordenador ha sacado papel");
		if (ia==3)
			System.out.println("El ordenador ha sacado tijeras");
		
		if (jugador==1 && ia==3) 
		System.out.println("Has ganado!!");
		if (jugador==2 && ia==1) 
		System.out.println("Has ganado!!");
		if (jugador==3 && ia==2) 
		System.out.println("Has ganado!!");
		
		if (jugador==1 && ia==2)	
		System.out.println("Has perdido!!");
		if (jugador==2 && ia==3) 
		System.out.println("Has perdido!!");
		if (jugador==3 && ia==1) 
		System.out.println("Has perdido!!");
		
		if (jugador==1 && ia==1) 
		System.out.println("Empate");
		if (jugador==2 && ia==2) 
		System.out.println("Empate");
		if (jugador==3 && ia==3) 
		System.out.println("Empate");
		
		}
	}
