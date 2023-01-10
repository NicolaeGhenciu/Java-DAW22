package Hanged;

import java.util.Random;
import java.util.Scanner;

public class HangedGame {

	public static void main(String[] args) {

		int op = 0;

		while (op < 2) {
			op = menu();
			if (op == 2) {
				break;
			}
			
			int count = 5;
			final String secretWord = word(); // palabra secreta
			int numberletter = secretWord.length(); // numero de letras
			char[] mask = newMask(numberletter); // declara la mascara
			char[] letterUsed = new char[50];
			int letterCount = 0;

			System.out.println("\tWelcome to the hangman game!\n__________________________________________");
			System.out.println(printMask(mask));

			while (count > 0) {

				System.out.println("__________________________________________");
				System.out.println("\nYou Have " + count + " lives.\n");
				
				doll(count);
				
				if (letterCount >= 1) {
					System.out.println("Used Letters : " + printMask(letterUsed) + "\n");
				}
				System.out.println("Enter a letter:");

				Scanner input = new Scanner(System.in); // aqui se introduce una letra

				char l = input.next().charAt(0);

				char letter = Character.toUpperCase(l);
					
				letterUsed[letterCount] = letter;
				++letterCount;

				char[] mask1 = verification(secretWord, letter, mask);
				if (contains(secretWord, letter, mask) == false) {
					count--;
				}
				System.out.println("\n__________________________________________\n");
				System.out.println(printMask(mask1));
				if (win(secretWord, mask1) == true) {
					thank();
					break;
				}
			}
			if (count <= 0) {
				System.out.println("\n───▐█────\r\n" + "──▐███───\r\n" + "──▐▐█▐───\r\n" + "───▐▐────\r\n" + "───▐▐────");
				System.out.println("\nWas the Word: " + secretWord);
				System.out.println("\nDefeat, press 1 to start over\n");}
		}
	}
	
	public static void thank() {
		System.out.println("\nWIN WIN WIN WIN WIN WIN WIN\n");
		System.out.println("\n▄▀▀░ █▀▀▄ ▄▀▄ ▄▀ ▀ ▄▀▄ ▄▀▀\r\n" + "█░▀▌ █▐█▀ █▀█ █░ █ █▀█ ░▀▄\r\n"
				+ "▀▀▀░ ▀░▀▀ ▀░▀ ░▀ ▀ ▀░▀ ▀▀░\n");
		System.out.println("\nWIN WIN WIN WIN WIN WIN WIN\n");
	}
	public static void doll(int count) {
		switch (count) {
		case 1:
			System.out.println(
					"───▐█────\r\n" + "──▐███───\r\n" + "──▐▐█▐───\r\n" + "───▐▐────\r\n" + "─────────\n");
			break;
		case 2:
			System.out.println(
					"───▐█────\r\n" + "──▐███───\r\n" + "──▐▐█▐───\r\n" + "─────────\r\n" + "─────────\n");
			break;
		case 3:
			System.out.println(
					"───▐█────\r\n" + "──▐███───\r\n" + "─────────\r\n" + "─────────\r\n" + "─────────\n");
			break;
		case 4:
			System.out.println(
					"───▐█────\r\n" + "─────────\r\n" + "─────────\r\n" + "─────────\r\n" + "─────────\n");
			break;
		}
	}

	public static char[] newMask(int n) { // este metodo lo que hace es convertir la palabra en _
		char[] mask = new char[n];
		for (int i = 0; i < n; i++) {
			mask[i] = '_';
		}
		return mask;
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

	public static boolean contains(String secretWord, char letter, char[] mask) {
		boolean a = false;

		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == letter) {
				a = true;
			}
		}
		return a;
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
	public static String word() { // este metodo genera la palabra secreta
		String[] words = { "Bear", "Seagull", "Apple", "Banana", "Elephant", "Train", "Digger", "Crocodile", "Truck",
				"Dolphin" };

		Random r = new Random();
		int random = r.nextInt(words.length); // esto elige la palabra del array

		String secretWord = words[random]; // aqui se puede ver la palabra.

		return secretWord.toUpperCase();
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
}