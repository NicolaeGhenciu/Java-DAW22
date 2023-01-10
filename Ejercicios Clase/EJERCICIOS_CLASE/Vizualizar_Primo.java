package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Vizualizar_Primo {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero");
		Scanner input = new Scanner (System.in);
		int n1 = input.nextInt();
		
		int n2 = 1;
		
		while (n2 < n1) {
			++n2;
			int n3 = n1 % n2;
			if (n3 == 0 && n1 != n2) {
				System.out.println("No es primo");
				break;
			} else {
				System.out.println("Es primo");
				break;
			}// fin del else
		}// fin del while
	}
}
