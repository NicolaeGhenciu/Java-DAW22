package EJERCICIOS_CLASE;

public class Generador_de_letrasynumeros {

	public static void main(String[] args) {
		System.out.println("Letra Mayuscula");
		System.out.println(lmayusculas());
		System.out.println("Letra Minuscula");
		System.out.println(lminuscula());
		System.out.println("Numero");
		System.out.println(numero());
		
	}

	public static char lmayusculas() {
		int a = (int) (Math.random() * (90 - 65) + 65);
		char letra = (char) a;
		return letra;
	}
	
	public static char lminuscula() {
		int a = (int) (Math.random() * (122 - 97) + 97);
		char letram = (char) a;
		return letram;
	}
	public static int numero() {
		int a = (int) (Math.random() * 10);
		return a;
	}
}
