package EJERCICIOS_CLASE;

import java.util.Scanner;

public class INTERCAMBIO_DE_VALORES {
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero por favor:");
		Scanner numeroteclado = new Scanner(System.in);
		
			double numero1 = numeroteclado.nextDouble();
			
		System.out.println("Introduce otro numero por favor:");
		Scanner numeroteclado2 = new Scanner(System.in);
			
			double numero2 = numeroteclado2.nextDouble();
			
		numero1 = numero1 + numero2;
		
		numero2 = numero1 - numero2;
		
		numero1 = numero1 - numero2;
		
		System.out.println("El intercambio de ambos numeros seria: " + numero1 + " y " +numero2);

}

}
