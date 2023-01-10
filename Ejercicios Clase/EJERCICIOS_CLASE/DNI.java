package EJERCICIOS_CLASE;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un DNI");
		
		String dni = teclado.next();
		
		boolean letras = (dni.charAt(8) >='a' && dni.charAt(8) <='z')
				|| (dni.charAt(8) >='A' && dni.charAt(8)<='Z'); // || sigifica o
		
		if (dni.length() == 9 && letras) //lenght sirve para conocer cuantos caracteres tiene. if (dni.length()-1 te devuelve el caracter qie esta en ultima posicion
			System.out.println("Todo va bien");
		else
			System.out.println("Algo no anda bien");
		
	}

}
