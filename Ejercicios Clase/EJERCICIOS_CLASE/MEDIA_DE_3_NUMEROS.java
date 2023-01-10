package EJERCICIOS_CLASE;

import java.util.Scanner;

public class MEDIA_DE_3_NUMEROS {

public static void main(String[] args) {
		
		System.out.print("Introduce un numero:");
		Scanner introduceelnumero1 = new Scanner (System.in);
		double numero1 = introduceelnumero1.nextDouble();
		
		System.out.print("Introduce un numero:");
		Scanner introduceelnumero2 = new Scanner (System.in);
		double numero2 = introduceelnumero2.nextDouble();
		
		System.out.print("Introduce un numero:");
		Scanner introduceelnumero3 = new Scanner (System.in);
		double numero3 = introduceelnumero3.nextDouble();
		
		double mediadenumeros = (numero1 + numero2 + numero3)/3;
		
		System.out.println("Se han introducido los numeros "+ numero1 + "  " + numero2 + numero3 + " La media de estos tres numeros es: " + mediadenumeros);
		
	}

}

