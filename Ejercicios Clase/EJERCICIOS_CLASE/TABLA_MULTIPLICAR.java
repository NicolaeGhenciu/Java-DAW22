package EJERCICIOS_CLASE;

import java.util.Scanner;

public class TABLA_MULTIPLICAR {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero del 1 al 10:  ");
		
		Scanner i = new Scanner(System.in);
		int teclado = i.nextInt();
		
		int uno = teclado * 1;
		int dos = teclado * 2;
		int tres = teclado * 3;
		int cuatro = teclado * 4;
		int cinco = teclado * 5;
		int seis = teclado * 6;
		int siete = teclado * 7;
		int ocho = teclado * 8;
		int nueve = teclado * 9;
		int diez = teclado * 10;
		
		System.out.println(teclado + " * " + "1" + " = " + uno);
		System.out.println(teclado + " * " + "2" + " = " + dos);
		System.out.println(teclado + " * " + "3" + " = " + tres);
		System.out.println(teclado + " * " + "4" + " = " + cuatro);
		System.out.println(teclado + " * " + "5" + " = " + cinco);
		System.out.println(teclado + " * " + "6" + " = " + seis);
		System.out.println(teclado + " * " + "7" + " = " + siete);
		System.out.println(teclado + " * " + "8" + " = " + ocho);
		System.out.println(teclado + " * " + "9" + " = " + nueve);
		System.out.println(teclado + " * " + "10" + " = " + diez);
	}

}