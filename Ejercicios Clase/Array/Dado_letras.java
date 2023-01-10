package Array;

import java.util.Scanner;

public class Dado_letras {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Cuantas veces quieres generar letras random?");
		int veces = input.nextInt();

		int[] contador = new int[26];

		for (int i = 0; i < veces; i++) {// cuenta lasveces que tiramos
			int a = (int) (Math.random() * (122 - 97) + 97);
			char letram = (char) a;
			contador[letram]++;
		}
		imprimir(contador);
	}

	public static void imprimir(int[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println("El " + (i + 1) + " ha salido " + c[i] + " veces");
		}
	}
}

