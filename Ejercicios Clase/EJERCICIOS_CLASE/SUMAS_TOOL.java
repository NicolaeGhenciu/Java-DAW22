package EJERCICIOS_CLASE;

import java.util.Scanner;

public class SUMAS_TOOL {
	public static void main(String[] args) {

		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		System.out.println("¿Cuando es " + num1 + " + " + num2 + "?");
		
		int respuesta = num1 + num2;
		
		System.out.print("Introduce la respuesta:");
		Scanner R = new Scanner (System.in);
		
		int respuestateclado = R.nextInt();
		
		if (respuestateclado == respuesta)
			System.out.println("La respuesta es correcta");
		
		else 
		System.out.println("La respuesta es incorrecta");
}
	}
