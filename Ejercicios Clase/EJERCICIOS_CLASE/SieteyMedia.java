package EJERCICIOS_CLASE;

import java.util.Scanner;

public class SieteyMedia {

	public static void main(String[] args) {
		int op = 0;
		double suma = 0;

		do {

			if (suma <= 7.5) {

				op = menu();

				switch (op) {

				case 1:
					int carta = carta();
					suma = suma + valorCarta(carta);
					System.out.println("Te ha salido el : " + carta);
					System.out.println("Valor: " + valorCarta(carta));
					System.out.println("Total: " + suma);
					System.out.println("");

					if (suma > 7.5)
						System.out.println("Perdiste!! Con una puntuación de: " + suma);

					break;
				case 2:
					System.out.println("Has abandonado el juego, con una puntuación de: " + suma);

					break;

				case 3:
					System.out.println("- Cartas del 1 al 10");
					System.out.println("- Desde el 1 al 7, el valor es su propio numero");
					System.out.println("- Desde el 8 al 10, el valor es de 0.5 puntos");
					System.out.println("");
					break;
				}// switch

			} // repetir suma

		} while (op != 2);

	}// main

	public static double valorCarta(int num_carta) { // Genera el numero al VALOR de la carta

		double valor_carta = 0;

		switch (num_carta) {
		case 1:
			valor_carta = 1;
			break;
		case 2:
			valor_carta = 2;
			break;
		case 3:
			valor_carta = 3;
			break;
		case 4:
			valor_carta = 4;
			break;
		case 5:
			valor_carta = 5;
			break;
		case 6:
			valor_carta = 6;
			break;
		case 7:
			valor_carta = 7;
			break;
		case 8:
		case 9:
		case 10:
			valor_carta = 0.5;
			break;

		}// switch

		return valor_carta;

	}// MET valorCarta

	public static int carta() { // Genera el numero de la carta

		int[] cartas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 8=10, 9=11, 10=12
		int carta = 0;

		for (int i = 0; i < 1; i++) {
			carta = (int) (Math.random() * 10 + 1);
		}

		return carta;
	}// MET cartas

	public static int menu() { // Genera el menú para el usuario

		Scanner in = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("\t7 Y MEDIA");
		System.out.println("---------------------------");
		System.out.println("1. Seguir jugando");
		System.out.println("2. Acabar");
		System.out.println("3. Valor de Cartas");
		System.out.print("Opción: ");
		int op = in.nextInt();
		System.out.println("");

		return op;

	}// MET userAnswer

}