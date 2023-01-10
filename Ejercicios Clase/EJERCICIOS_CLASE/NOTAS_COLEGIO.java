package EJERCICIOS_CLASE;

import java.util.Scanner;

public class NOTAS_COLEGIO {
	public static void main(String[] args) {
		System.out.println("Introduce la nota:");
		Scanner n = new Scanner(System.in);
		
		double nota = n.nextDouble();
		
		if (nota < 5)
			System.out.println("Insuficiente");
		else if (nota < 6)
			System.out.println("Suficiente");
		else if (nota < 7)
			System.out.println("Bien");
		else if (nota < 9)
			System.out.println("Notable");
		else if (nota < 10)
			System.out.println("SB");
		
}
	}
