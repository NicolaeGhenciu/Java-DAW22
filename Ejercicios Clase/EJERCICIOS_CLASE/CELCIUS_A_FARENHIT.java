package EJERCICIOS_CLASE;

import java.util.Scanner;

public class CELCIUS_A_FARENHIT {
	
	public static void main(String[] args) {
		System.out.print("Introduce celcius:");
		Scanner gradoscelcius = new Scanner (System.in);
		
		double celcius = gradoscelcius.nextDouble();
		double fahrenheit = ( celcius * 9/5 ) + 32; //en una division empezar 5/9           5.0/9
		
		System.out.println( celcius + " grados Celcius son " + fahrenheit + " grados fahrenheit ");

	}

}