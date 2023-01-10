package Array;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		final int DIMENSION = 500;
		int[] tabla = null;
		int opcion = 0;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				tabla = introValues(DIMENSION);
				break;
			case 2:
				tabla = randomValues(DIMENSION);
				break;
			case 3:
				printTable(tabla);
				break;
			}
		} while (opcion != 4);

	}// main

	public static void printTable(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("number " + i + " : " + numbers[i]);

		}
	}

	public static int[] randomValues(int tam) {
		int[] numbers = new int[tam];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = (int) (Math.random() * 500);
		}

		return numbers;
	}

	public static int[] introValues(int tam) {
		int[] numbers = new int[tam];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Give me number " + i + " : ");
			numbers[i] = in.nextInt();
		}

		return numbers;
	}

	public static int menu() {

		Scanner in = new Scanner(System.in);
		System.out.println("\tMenu");
		System.out.println("--------------------");
		System.out.println("1. Inicializar array con valores por teclado");
		System.out.println("2. Inicializar array con valores random");
		System.out.println("3. Visualizar Array");
		System.out.println("Opcion: ");
		int opcion = in.nextInt();

		return opcion;
	}// MET menu

}