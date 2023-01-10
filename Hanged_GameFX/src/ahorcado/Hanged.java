package ahorcado;

import diccionario.Diccionario;
import view.Body;

public class Hanged {
	
	private static String palabra;
	private static boolean a = false;

	public Hanged(String palabra) {
		this.palabra = palabra;
	}

	public static char[] newMask() {
		char[] mask = new char[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			mask[i] = '_';
		}
		return mask;
	}

	public static String printMask() {
		char[] mask = newMask();
		String m = "";
		for (int i = 0; i < mask.length; i++)
			m += " " + mask[i];
		return m;
	}

	public static String letrasUsadas(char letter, String label) {

		String letra = String.valueOf(letter);

		for (int i = 0; i < label.length(); i++) {
			if (label.charAt(i) == letter) {
				break;
			} else {
				label = label + " " + letra;
				break;
			}
		}
		return label;
	}
	
	public static String mascaraPlabra() {
		char[] sW = new char[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			sW[i] = palabra.charAt(i);
		}
		// aqui hacemos un array char con la palabra

		String m = "";
		for (int i = 0; i < sW.length; i++)
			m += " " + sW[i];
		// aqui lo convertimos en String
		return m;
	}

	public static String verification(char letter, String mascara) {

		char[] mask = new char[mascara.length()]; // esto va a ser nuestra mascara actual
		for (int i = 0; i < mascara.length(); i++) {
			char letra = mascara.charAt(i);
			mask[i] = letra;
		} // aqui hacemos un array char nuestra mascara actual

		char[] palabraSecreta = new char[mascaraPlabra().length()];
		for (int i = 0; i < mascaraPlabra().length(); i++) {
			palabraSecreta[i] = mascaraPlabra().charAt(i);
		}

		// aqui lo convertimos en array char de nuevo

		for (int i = 0; i < mascara.length(); i++) {
			if (palabraSecreta[i] == letter) {
				mask[i] = letter;
			}
		}
		// aqui actualizamos la mascara

		String mascaraActualizada = "";
		for (int i = 0; i < mascara.length(); i++) {
			mascaraActualizada = mascaraActualizada + mask[i];
		}
		// aqui convertimos nuestra mascara en un String

		if (mascara.equals(mascaraActualizada)) {
			a = false;
		} else {
			a = true;
		}
		return mascaraActualizada;
	}

	public static boolean isA() {
		return a;
	}

	public static void setA(boolean a) {
		Hanged.a = a;
	}

}
