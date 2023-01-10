package ArrayBidimensionales;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op = 0;
		double[][] elementos = null; // Definimos la matriz y le damos valor inicial

		while (op != 5) {
			op = menu();
			switch (op) {
			case 0:
				System.out.println("Number de elementos: ");
				elementos = Random();
				break;
			case 1:
				imprimirArray(elementos);
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			}
		}

	}

	public static double[][] Random() {
		double[][] elem = new double[12][10];
		for (int x = 0; x < elem.length; x++) {
			for (int y = 0; y < elem[x].length; y++) {
				elem[x][y] = (int) (Math.random() * 45);
			}
		}
		return elem;
	}

	public static void imprimirArray(double[][] elem) {
		System.out.println(
				"   2010      2011      2012     2013      2014      2015      2016      2017     2018       2019\n");
		for (int x = 0; x < elem.length; x++) {
			for (int y = 0; y < elem[x].length; y++)
				System.out.print(" | " + elem[x][y] + " | ");
			System.out.println(
					"\n--------------------------------------------------------------------------------------------------");
		}
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0. Rellenar Array");
		System.out.println("1. Ver todos los datos");
		System.out.println("2. Ver cual ha sido el año mas caluroso");
		System.out.println("3. Ver cual ha sido el mes mas frio");
		System.out.println("4. Ver la temperatura media de cada año");
		System.out.println("5. Determinar el año mas caluroso");
		System.out.println("6. Exit");
		int op = input.nextInt();
		return op;
	}
}
