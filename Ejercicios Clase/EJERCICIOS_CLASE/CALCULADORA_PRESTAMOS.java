package EJERCICIOS_CLASE;

import java.util.Scanner;

public class CALCULADORA_PRESTAMOS {
	
	public static void main(String[] args) {
		System.out.println("Introduce la tasa de interes anual:");
		Scanner i = new Scanner(System.in);
		
		double interesanual = i.nextDouble();
		
		//para obtener el interes mensual:
		
		double interesmensual = interesanual / 1200;
		
		System.out.println("Introduce el numero de años:");
		Scanner y = new Scanner(System.in);
		
		int year = y.nextInt();
		
		System.out.println("Introduce el montante del prestamo:");
		Scanner m = new Scanner(System.in);
		
		double montante = m.nextDouble();
		
		//calculando los pagos:
		
		double pagomensual = montante * interesmensual / (1 - 1 / Math.pow(1 + interesmensual, year * 12));
		double pagototal = pagomensual * year * 12;
		
		//Display Results
		System.out.println("Al mes se paga:  " + (int)(pagomensual * 100) / 100.0);
		System.out.println("El pago total es:  " + (int)(pagototal * 100) / 100.0);
		
	}

}
