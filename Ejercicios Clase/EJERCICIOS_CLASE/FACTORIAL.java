package EJERCICIOS_CLASE;

import java.util.Scanner;

public class FACTORIAL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int x = input.nextInt();
		
		int f =1;
		while (x > 1 ) {
			f *=x;
			x--;
		}
		System.out.println("Factorial :" +f);

	}
}
