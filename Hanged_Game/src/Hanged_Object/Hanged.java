package Hanged_Object;

import java.util.Random;
import java.util.Scanner;

public class Hanged {

	public static void main(String[] args) throws Exception {

		String direccion = ("Words.txt.txt");
		Dictionary s = new Dictionary(direccion);
		Vidas v = new Vidas();
		int op = 0;
		game(op, v, s);
	}

	public static void game(int op, Vidas v, Dictionary s) {

		while (op != 2) {
			op = menu();

			int vidas = v.getVidas();
			final String secretWord = s.getRandomWord().toUpperCase();
			int numberletter = secretWord.length(); // numero de letras
			char[] letterUsed = new char[50];
			int letterCount = 0;

			Mask m = new Mask(numberletter);
			char[] mask = m.newMask();

			System.out.println("\tWelcome to the hangman game!\n__________________________________________");
			System.out.println(secretWord);
			System.out.println("\t\t" + m.printMask());

			while (vidas > 0) {

				System.out.println("__________________________________________");
				System.out.println("\nYou Have " + vidas + " lives.\n");

				if (letterCount >= 1)
					System.out.println("Used Letters : " + m.printMask(letterUsed) + "\n");

				System.out.println("Enter a letter:");

				Scanner input = new Scanner(System.in); // aqui se introduce una letra
				char l = input.next().charAt(0);
				char letter = Character.toUpperCase(l);

				letterUsed[letterCount] = letter;
				++letterCount;

				char[] mask1 = m.verification(secretWord, letter, mask);
				if (contains(secretWord, letter, mask) == false)
					vidas--;

				System.out.println("\n__________________________________________\n");
				System.out.println(m.printMask(mask1));

				if (win(secretWord, mask1) == true) {
					thank();
					break;
				}
			}
			Lose(vidas, secretWord);
		}
	}

	public static void Lose(int vidas, String secretWord) {
		if (vidas <= 0) {
			System.out.println("\n───▐█────\r\n" + "──▐███───\r\n" + "──▐▐█▐───\r\n" + "───▐▐────\r\n" + "───▐▐────");
			System.out.println("\nWas the Word: " + secretWord);
			System.out.println("\nDefeat, press 1 to start over\n");
		}
	}

	public static boolean win(String secretWord, char[] mask) {
		boolean a = false;

		String word = "";
		char l;

		for (int i = 0; i < secretWord.length(); i++) {
			l = mask[i];
			word = word + l;
		}
		if (secretWord.equals(word)) {
			a = true;
		}
		return a;
	}

	public static boolean contains(String secretWord, char letter, char[] mask) {
		boolean a = false;

		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == letter) {
				a = true;
			}
		}
		return a;
	}

	public static void doll(int vidas) {
		switch (vidas) {
		case 1:
			System.out.println("───▐█────\r\n" + "──▐███───\r\n" + "──▐▐█▐───\r\n" + "───▐▐────\r\n" + "─────────\n");
			break;
		case 2:
			System.out.println("───▐█────\r\n" + "──▐███───\r\n" + "──▐▐█▐───\r\n" + "─────────\r\n" + "─────────\n");
			break;
		case 3:
			System.out.println("───▐█────\r\n" + "──▐███───\r\n" + "─────────\r\n" + "─────────\r\n" + "─────────\n");
			break;
		case 4:
			System.out.println("───▐█────\r\n" + "─────────\r\n" + "─────────\r\n" + "─────────\r\n" + "─────────\n");
			break;
		}
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("The Hangman Game\n");
		System.out.println("─▌█──║─║╔═║─║─╔═╗─\r\n" + "─███─╠═╣╠═║─║─║─║─\r\n" + "─▐█▐─║─║╚═╚═╚═╚═╝─\r\n"
				+ "─▐▐───────────────\r\n" + "─▐▐───────────────\r\n" + "");
		System.out.println("Press 1 to start.");
		System.out.println("Press 2 to exit.");
		int op = input.nextInt();
		return op;
	}

	public static void thank() {
		System.out.println("\nWIN WIN WIN WIN WIN WIN WIN\n");
		System.out.println(
				"\n▄▀▀░ █▀▀▄ ▄▀▄ ▄▀ ▀ ▄▀▄ ▄▀▀\r\n" + "█░▀▌ █▐█▀ █▀█ █░ █ █▀█ ░▀▄\r\n" + "▀▀▀░ ▀░▀▀ ▀░▀ ░▀ ▀ ▀░▀ ▀▀░\n");
		System.out.println("\nWIN WIN WIN WIN WIN WIN WIN\n");
	}
}
