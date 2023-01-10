package EJERCICIOS_CLASE;

import java.util.Scanner;

public class SEGUNDOS_A_MINUTOS {
public static void main(String[] args) {
		
		System.out.print("Introduce un numero (segundos) para pasarlos a minutos:");
		Scanner segundosteclado = new Scanner (System.in);
		int segundos = segundosteclado.nextInt();
		int minutos = segundos/60;
		segundos = segundos%60;
		System.out.println(" En total tenemos " + minutos + " minutos " + segundos + " y segundos " );
				
	}
}