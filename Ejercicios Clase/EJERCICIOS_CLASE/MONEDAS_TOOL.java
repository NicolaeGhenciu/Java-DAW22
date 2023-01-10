package EJERCICIOS_CLASE;

import java.util.Scanner;

public class MONEDAS_TOOL {
public static void main(String[] args) {
		
		System.out.println("Introduce la cantidad de centimos:  ");
		Scanner C = new Scanner(System.in);
		
		//double Centimos = C.nextDouble();
		//int Centimos = (int)(C * 100 );
		
		int Centimos = C.nextInt();
		
		int Euros = Centimos / 100;
		Centimos = Centimos % 100;
		
		int cincuentacentimos = Centimos / 50;
		Centimos = Centimos % 50;
		
		int veintecentimos = Centimos / 20;
		Centimos = Centimos % 20;
		
		int diezcentimos = Centimos / 10;
		Centimos = Centimos % 10;
		
		int cincocentimos = Centimos / 5;
		Centimos = Centimos % 5;
		
		int uncentimo = Centimos;
		
		System.out.println("Monedas de euro:  " + Euros);
		System.out.println("Monedas de 50:  " + cincuentacentimos);
		System.out.println("Monedas de 20  " + veintecentimos);
		System.out.println("Monedas de 10" + diezcentimos);
		System.out.println("Monedas de 5: " + cincocentimos);
		System.out.println("Monedas de 1:  " + uncentimo);
		
}
	}
