package Array;

import java.util.Scanner;

public class JuegoDados {

	public static void main(String[] args) {

		int intentos = 0;

		Scanner input = new Scanner(System.in);

		int op = 0;
		
		int[] tabla = new int[6];

		int c = 0;

		while (c < 1) {
			Random(tabla);
			++c;
			intentos++;
		}

		while (op < 2) {
			int contador = 0;
			op = Menu(intentos, tabla); 
			switch (op) {
			case 1:
				Dado(tabla);
				++intentos;
				break;
			case 2:
				System.out.println("Xk te fuiste wey D:");
				break;
			case 4:Comprobar(tabla);break;
			}
		}
	}

	public static int[] Random(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) ((Math.random() * 6) + 1);
		}
		return tabla;
	}

	public static void Imprimir(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dado nº " + i + " : " + tabla[i]);
		}
	}

	public static int[] Dado(int[] tabla) {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Que dado quieres volver a tirar?");
		int dado = input.nextInt();

		tabla[dado] = (int) ((Math.random() * 6) + 1);

		return tabla;
	}

	public static boolean Comprobar(int[] tabla) { 
		
		boolean a = true;
		
		int P[] = new int[6];
		int P1[] = new int[] {1,2,3,4,5,6};
		
		for (int i = 0; i < tabla.length; i++) {
			switch (tabla[i]) {
			case 1:P[0] = +1;break;
			case 2:P[1] = +2;break;
			case 3:P[2] = +3;break;
			case 4:P[3] = +4;break;
			case 5:P[4] = +5;break;
			case 6:P[5] = +6;break;
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			int valor1 = P[i];
			int valor2 = P1[i];
			
			if (valor1 != valor2) {
				a = false;}
		}
		
		return a;
	}

	public static int Menu(int intentos, int []tabla) {
		System.out.println("\t\tGAME\n\n\tLlevas un total de " + intentos + " intentos."
				+ "\n_____________________________________________");
		Scanner input = new Scanner(System.in);
		System.out.println("Estos son los resultados:");
		Imprimir(tabla);
		
		if (Comprobar(tabla) == true) {
		System.out.println("Lo has conseguido en " + intentos + " intentos.");}
		
		System.out.println("Pulsa 1 para voler a tirar un dado.");
		System.out.println("Pulsa 2 para salir.");
		int op = input.nextInt();
		return op;
	}

}
