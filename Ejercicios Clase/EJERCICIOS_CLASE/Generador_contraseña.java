package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Generador_contrase�a {

	public static void main(String[] args) {
		
		System.out.println("�Cuantos digitos quieres que tenga tu contrase�a?");
		Scanner a = new Scanner(System.in);
		int numero = a.nextInt();

		int contador = 0;
		
		String contrase�a = "";
		String contrase�a1 = "";
		
		while (contador < numero) {
			++contador;
			int aleatorio = (int) ((Math.random() * 4) + 1);
			if (aleatorio == 1) {
			}
		}
		
		System.out.println(contrase�a);

	}

	public static char otros() {
		int x = (int) (Math.random() * (48 - 33) + 33);
		char caracter = (char) x;
		return caracter;
	}

	public static char lminusculas() {
		int a = (int) (Math.random() * (122 - 97) + 97);
		char letram = (char) a;
		return letram;
	}

	public static char lmayusculas() {
		int a = (int) (Math.random() * (90 - 65) + 65);
		char letra = (char) a;
		return letra;
	}

	public static char numeros() {
		char numero = (char) ((Math.random() * 10) + 1);
		return numero;
	}

}