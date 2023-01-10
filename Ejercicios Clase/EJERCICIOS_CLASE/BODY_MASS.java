package EJERCICIOS_CLASE;

import java.util.Scanner;

public class BODY_MASS {

public static void main(String[] args) {
		
		System.out.println("Indica tu Altura: ");
		Scanner a = new Scanner (System.in);
		
		double altura = a.nextDouble();
		
		System.out.println("Indica tu Peso: ");
		Scanner p = new Scanner (System.in);
		
		double peso = p.nextDouble();
		double IMC = peso / Math.pow(altura, altura);
		
		if (IMC < 18.5)
			System.out.println("Underweight");
		else if (IMC < 25)
			System.out.println("Normal");
		else if (IMC < 30 )
			System.out.println("Overweight");
		else if (IMC < 100)
			System.out.println("Obese");
		
		System.out.println(Math.round(IMC*100.00)/100.00);
		
		//and &&, or !! not!
		//x!=y		
	}	
}
