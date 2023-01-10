package Array;

import java.util.Scanner;

public class MenuV3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op = 0;
		int[] tabla = null;

		while (op != 8) {
			op = menu();
			switch (op) {
			case 0:
				tabla = Teclado();
				break;
			case 1:
				tabla = Random();
				break;
			case 2:
				Imprimir(tabla);
				break;
			case 3:
				System.out.println("El sumatorio total es : " + Suma(tabla));
				break;
			case 4:
				System.out.println("El numero mayor es : " + Mayor(tabla));
				break;
			case 5:
				System.out.println("El numero menor es : " + Menor(tabla));
				break;
			case 6:
				Barajar(tabla);
				break;
			case 7:
				DarVuelta(tabla);break;
			case 8:
				System.out.println("Se cerro el menu");
				break;
			} // fin del switch
		} // fin del while
	} // fin del metodo

	public static int[] Teclado() {
		System.out.println("¿Que longitud tendra la Array?");
		Scanner in = new Scanner(System.in);
		int longitud = in.nextInt();
		int tabla[] = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			System.out.print("Valor de " + i + " = ");
			int valor = in.nextInt();
			tabla[i] = valor;
		}
		return tabla;
	}

	public static int[] Random() {
		System.out.println("¿Que longitud quieres que tenga el Array?");
		Scanner in = new Scanner(System.in);
		int longitud = in.nextInt();
		int tabla[] = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			int valor = (int) (Math.random() * 500);
			tabla[i] = valor;
		}
		return tabla;
	}

	public static void Imprimir(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Valor de " + i + " : " + tabla[i]);
		}
	}

	public static int Suma(int[] tabla) {

		int suma = 0;

		for (int i = 0; i < tabla.length; i++) {

			suma = suma + tabla[i];
		}
		return suma;
	}

	public static int Mayor(int[] tabla) {
		int mayor = 0;

		for (int i = 0; i < tabla.length; i++) {
			if (mayor < tabla[i])
				mayor = tabla[i];
		}
		return mayor;
	}

	public static int Menor(int[] tabla) {

		int menor = tabla[0];

		for (int i = 0; i < tabla.length; i++) {
			if (menor > tabla[i])
				menor = tabla[i];
		}
		return menor;
	}

	public static void Barajar(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			int p = (int) (Math.random() * (tabla.length));
			int aux = tabla[i];
			tabla[i] = tabla[p];
			tabla[p] = aux;
		}
	}

	public static void DarVuelta(int[] tabla) { //es para dar la vuelta a una array

		int aux;
		
		for (int i = 0; i < tabla.length / 2; i++) {
	        aux = tabla[i];
	        tabla[i] = tabla[tabla.length - 1 - i];
	        tabla[tabla.length - 1 - i] = aux;
	    }
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0. Rellenar Array por teclado");
		System.out.println("1. Rellenar Array con numeros Random");
		System.out.println("2. Ver Array");
		System.out.println("3. Suma de todos los elementos");
		System.out.println("4. Cual es el numero mayor?");
		System.out.println("5. Cual es el numero menor?");
		System.out.println("6. Barajar Array");
		System.out.println("7. Dar la vuelta a los valores de la Array");
		System.out.println("8. Salir ");
		int op = input.nextInt();
		return op;
	}
}