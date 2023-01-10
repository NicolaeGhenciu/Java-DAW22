package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Matricula_Futura {

	public static void main(String[] args) {
		
		
		
		System.out.println("Introduce un montante: ");
		Scanner input = new Scanner (System.in);
		double m = input.nextDouble();
		
		System.out.println("Introduce un tipo de interes:  ");
		Scanner imput = new Scanner (System.in);
		double i =imput.nextDouble();
		double interes = (i/100)+1;
		
		double mc = m * 2;
		
		int año = 0;
		
		while (m < mc ) {
			++año;
			m = m * interes;
			System.out.println("Año "+ año + " = " + m);
		}
		}
	}

