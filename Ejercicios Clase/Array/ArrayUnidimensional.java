package Array;

import java.util.Scanner;

public class ArrayUnidimensional {

	public static void main(String[] args) {
		int op = 0;
		int[] tabla = null;

		do {
			op = menu();
			switch (op) {
			case 1:
				tabla = darValores();
				break;
			case 2:
				tabla = valoresRandom();
				break;
			case 3:
				imprimirArray(tabla);
				break;
			case 4:
				System.out.println("El sumatorio es: " + sumar(tabla));
				break;
			case 5:
				System.out.println("El numero mayor es: " + mayorNumero(tabla));
				break;
			case 6:
				System.out.println("El numero mayor es: " + menorNumero(tabla));
				break;
			case 7:
				barajar(tabla);
				break;
			case 0:
				System.out.println("Se cerró el menú");
				break;
			}
		} while (op != 0);

	}// main

	public static int[] darValores() {

		Scanner in = new Scanner(System.in);
		System.out.print("Longitud del array: ");
		int lon = in.nextInt();
		int[] tabla = new int[lon];

		for (int i = 0; i < lon; i++) {
			System.out.print("Valor de " + i + " = ");
			int valor = in.nextInt();
			tabla[i] = valor;
		} // for

		return tabla;

	}// MET darValores

	public static int[] valoresRandom() {

		Scanner in = new Scanner(System.in);
		System.out.print("Longitud del array: ");
		int lon = in.nextInt();
		int[] tabla = new int[lon];

		for (int i = 0; i < tabla.length; i++) {

			int nr = (int) (Math.random() * (10 - 0) + 0);
			tabla[i] = nr;

		} // for

		return tabla;

	}// MET valoresRandom

	public static void imprimirArray(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Valor " + i + ": " + tabla[i]);
		} // for

	}// MET imprimirArray

	public static int sumar(int[] tabla) {

		int suma = 0;

		for (int i = 0; i < tabla.length; i++) {

			suma = suma + tabla[i];
		}

		return suma;
	}// MET sumar

	public static int mayorNumero(int[] tabla) {

		int mayor = tabla[0];

		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] > mayor)

				mayor = tabla[i];

		}

		return mayor;
	} // MET mayorNumero

	public static int menorNumero(int[] tabla) {

		int menor = tabla[0];

		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] < menor)

				menor = tabla[i];

		}

		return menor;
	} // MET menorNumero

	public static void barajar(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {

			int p = (int) (Math.random() * (tabla.length));
			int aux = tabla[i];
			tabla[i] = tabla[p];
			tabla[p] = aux;

		} // for

	}// MET barajar

	public static int menu() {

		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("\tMenu");
		System.out.println("-----------------");
		System.out.println("0. Salir");
		System.out.println("1. Dar valores al array");
		System.out.println("2. Dar valores random al array");
		System.out.println("3. Imprimir valores del array");
		System.out.println("4. Sumar todos los valores del array");
		System.out.println("5. Calcular el numero mayor");
		System.out.println("6. Calcular el numero menor");
		System.out.println("7. Barajar array");
		System.out.print("Opcion: ");
		int op = in.nextInt();
		System.out.println("");

		return op;
	}// MET menu

}
