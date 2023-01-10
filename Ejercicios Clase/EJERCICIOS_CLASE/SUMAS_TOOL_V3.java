package EJERCICIOS_CLASE;

import java.util.Scanner;

public class SUMAS_TOOL_V3 {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido Cabeza");
		
		int contador = 0; //el valor donde se almacena los numeros
		int fallos =0;
		
		while (contador < 10) {  //el while contador
	
			int n3 = (int)(Math.random()*2)+1; //nuemero aleatorio del 1 al 2 para saber si se suma o resta
			
			if (n3 == 1) { //1 suma
			
			++contador;
			
			System.out.println("Contador: " + contador); //te dice cuantas partidas llevas
			
			int n1 = (int)(Math.random()*100)+1;
			int n2 = (int)(Math.random()*100)+1; //nuemeros aleatorios
			
			int respuestaCorrecta = n1 + n2; //respuesta correcta
			
			System.out.println("La respuesta correcta es " + respuestaCorrecta); //te dice la respuesta correcta
			
			System.out.println("¿Cuanto es " + n1 + " + " + n2 + "?"); //La pregunta
			
			Scanner i = new Scanner (System.in);//respuesta introducida por el usuario
			int teclado = i.nextInt();
			
			boolean elvalor = teclado == respuestaCorrecta; //esto dara un valor verdadero si acertamos
			
			while (elvalor == false) { //mientras la respuesta este mal, se repetira este bucle
				++fallos;
				System.out.println("Te has equivocado, por favor intentalo de nuevo: ");
				System.out.println("¿Cuanto es " + n1 + " + " + n2 + "?");
				teclado = i.nextInt();
				elvalor = teclado == respuestaCorrecta;}
			
			System.out.println("Enhorabuena!!");
			
			} //aqui se acaba el if
			
			if (n3 == 2) { //2 resta
			
			++contador;
			
			System.out.println("Contador: " + contador); //te dice cuantas partidas llevas
			
			int n1 = (int)(Math.random()*100)+1;
			int n2 = (int)(Math.random()*100)+1; //nuemeros aleatorios
			
			if (n1 < n2) {			//intercambio de variables
				n1 = n1 + n2;
				n2 = n1 - n2;
				n1 = n1 - n2;
			}
			
			int respuestaCorrecta = n1 - n2; //respuesta correcta
			
			System.out.println("La respuesta correcta es " + respuestaCorrecta); //te dice la respuesta correcta
			
			System.out.println("¿Cuanto es " + n1 + " - " + n2 + "?"); //la pregunta
			
			Scanner i = new Scanner (System.in);//respuesta introducida por el usuario
			int teclado = i.nextInt();
			
			boolean elvalor = teclado == respuestaCorrecta; //esto dara un valor verdadero si acertamos
			
			while (elvalor == false) { //mientras la respuesta este mal, se repetira este bucle
				++fallos;
				System.out.println("Te has equivocado, por favor intentalo de nuevo: ");
				System.out.println("¿Cuanto es " + n1 + " - " + n2 + "?");
				teclado = i.nextInt();
				elvalor = teclado == respuestaCorrecta;}
			
			System.out.println("Enhorabuena!!");
			
			} //aqui se acaba el if
		} //aqui se acaba el contador
		
		System.out.println("Fallos: " + fallos); //contador numero de fallos
		
	}
}