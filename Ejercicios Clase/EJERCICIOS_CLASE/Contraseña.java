package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Contraseņa {

	public static void main(String[] args) {
		
		System.out.println("Introduce un Nombre para tu Usuario:  ");
		
		Scanner input = new Scanner (System.in);
		String nombre = input.next();
		
		System.out.println("Introduce una Contraseņa:  ");
		
		Scanner input1 = new Scanner (System.in);
		String contraseņa = input1.next();
		
		while (contraseņa.length() < 8) {
			
			System.out.println("La contraseņa es demasiado corta, tiene que tener como minimo 8 caracteres, porfavor prueba de nuevo: ");
			contraseņa = input1.next();
			
			
		}
		
		System.out.println("Contraseņa Valida");
		
	}
}
