package EJERCICIOS_CLASE;

import java.util.Scanner;

public class SUMAS_TOOL_WHILE {

	public static void main(String[] args) {
		int numero1 = (int)(Math.random()*100);
		int numero2 = (int)(Math.random()*100);
		
		System.out.println("¿Cuanto es " + numero1 + " + " + numero2 + "?");
		
		Scanner input = new Scanner(System.in);
		
		int respuesta = input.nextInt();
		int respuestaCorrecta = numero1+ numero2;
		
		while (respuestaCorrecta != respuesta);
		{
			System.out.println("Intentalo de nuevo;  ");
			respuesta = input.nextInt();
		}
		System.out.println("Muy bien!!");
	}
	}
