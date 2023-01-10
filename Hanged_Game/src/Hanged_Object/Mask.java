package Hanged_Object;

public class Mask {
	public static int numeroLetras;

	public Mask(int n) {
		this.numeroLetras = n;
	}

	public static char[] newMask() { // este metodo lo que hace es convertir la palabra en _
		char[] mask = new char[numeroLetras];
		for (int i = 0; i < numeroLetras; i++) {
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

	public static String printMask(char[] mask) {
		String m = "";
		for (int i = 0; i < mask.length; i++)
			m += " " + mask[i];
		return m;
	}

	public static char[] verification(String secretWord, char letter, char[] mask) {

		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == letter) {
				mask[i] = letter;
			}
		}
		return mask;
	}
}
