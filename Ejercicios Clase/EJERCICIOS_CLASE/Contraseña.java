package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Contrase�a {

	public static void main(String[] args) {
		
		System.out.println("Introduce un Nombre para tu Usuario:  ");
		
		Scanner input = new Scanner (System.in);
		String nombre = input.next();
		
		System.out.println("Introduce una Contrase�a:  ");
		
		Scanner input1 = new Scanner (System.in);
		String contrase�a = input1.next();
		
		while (contrase�a.length() < 8) {
			
			System.out.println("La contrase�a es demasiado corta, tiene que tener como minimo 8 caracteres, porfavor prueba de nuevo: ");
			contrase�a = input1.next();
			
			
		}
		
		System.out.println("Contrase�a Valida");
		
	}
}
