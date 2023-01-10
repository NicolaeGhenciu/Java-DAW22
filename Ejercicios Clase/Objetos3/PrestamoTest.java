package Objetos3;

import java.util.Scanner;

public class PrestamoTest {

	public static void main(String[] args) {

		int x = 1;
		while (x != 2) {

			Scanner input = new Scanner(System.in);
			int op = 0;
			double a = 0;
			int b = 0;
			double c = 0;

			Prestamo p = new Prestamo();
			Scanner s = new Scanner(System.in);
			System.out.println(p);

			while (op != 7) {
				op = menu();
				switch (op) {
				case 1:
					System.out.println("Interes Anual: ");
					a = s.nextDouble();
					p.setInteresAnual(a);
					break;
				case 2:
					System.out.println("Numero de Años: ");
					b = s.nextInt();
					p.setNumeroAños(b);
					break;
				case 3:
					System.out.println("Montante: ");
					c = s.nextInt();
					p.setMontante(c);
					break;
				case 4:
					System.out.println("Al mes se paga: " + p.pagoMensual());
					break;
				case 5:
					System.out.println("El pago total es: " + p.totalPagar());
					break;
				case 6: System.out.println(p);
				}
			}
		}
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Introduce la tasa de interes anual:");
		System.out.println("2. Introduce el numero de años:");
		System.out.println("3. Introduce el montante: ");
		System.out.println("4. Para ver lo que se paga al mes.");
		System.out.println("5. Para ver lo que se paga en Total.");
		System.out.println("6. Para ver Todo.");
		int op = input.nextInt();
		return op;

	}
}
