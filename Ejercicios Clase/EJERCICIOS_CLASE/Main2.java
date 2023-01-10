package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(sumNumbers(3, 7));
		System.out.println(sumNumbers(13, 70));
		System.out.println(sumNumbers(32, 89));
		System.out.println("Numer 1:  ");
		int x = input.nextInt();

		System.out.println("Numer 2:  ");
		int y = input.nextInt();
		System.out.println(sumNumbers(x, y));
	}

	public static int sumNumbers(int n1, int n2) {
		int suma = 0;
		for (int i = n1; i <= n2; i++)
			suma += i;
		return suma;
	}

}
