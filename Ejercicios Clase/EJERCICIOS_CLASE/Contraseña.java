package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		
		System.out.println("Introduce un Nombre para tu Usuario:  ");
		
		Scanner input = new Scanner (System.in);
		String nombre = input.next();
		
		System.out.println("Introduce una Contraseña:  ");
		
		Scanner input1 = new Scanner (System.in);
		String contraseña = input1.next();
		
		while (contraseña.length() < 8) {
			
			System.out.println("La contraseña es demasiado corta, tiene que tener como minimo 8 caracteres, porfavor prueba de nuevo: ");
			contraseña = input1.next();
			
			
		}
		
		System.out.println("Contraseña Valida");
		
	}
}
