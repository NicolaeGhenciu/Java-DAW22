package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Tabla_MultiplicarV2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Multiplication Table");
		int num = input.nextInt();
		int i=0;
		while (i<=10) {
			i++;
			System.out.println(i + " * " + num + " = " + num * i);
		}
	}

}
