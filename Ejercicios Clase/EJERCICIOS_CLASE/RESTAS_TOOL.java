package EJERCICIOS_CLASE;

import java.util.Scanner;

public class RESTAS_TOOL {

	public static void main(String[] args) {

		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		if (num1 < num2) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		
		System.out.println("¿Cuanto es " + num1 + " - " + num2 + "?");
		
		int respuesta = num1 - num2;
		
		System.out.print("Introduce la respuesta:");
		Scanner R = new Scanner (System.in);
		
		int respuestateclado = R.nextInt();
		
		boolean comprobación = (respuesta == respuestateclado);
		
		System.out.println(comprobación);	
}
	}
