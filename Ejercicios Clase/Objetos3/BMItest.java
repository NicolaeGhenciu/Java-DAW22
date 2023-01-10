package Objetos3;

import java.util.Scanner;

public class BMItest {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int op = 0;
			BMI b = new BMI();
			Scanner s = new Scanner(System.in);
			double a = 0;
			double p = 0;
			int e = 0;
			String n = "";

			while (op != 5) {
				op = menu();
				switch (op) {
				case 1:System.out.println(b);break;
				case 2:
				System.out.println("Introduce tu nombre");
				n = s.next();
				b.setNombre(n);
				System.out.println("Introduce tu altura");
				a = s.nextDouble();
				b.setAltura(a);
				System.out.println("Introduce tu peso");
				p = s.nextDouble();
				b.setPeso(p);
				System.out.println("Introduce tu edad");
				e = s.nextInt();
				b.setEdad(e);break;
				case 3:System.out.println(b.getBMI());;break;
				case 4:b.getStatus();break;
				}
			}
		}

		public static int menu() {
			Scanner input = new Scanner(System.in);
			System.out.println("1. Ver Datos");
			System.out.println("2. Cambiar Datos");
			System.out.println("3. BMI value");
			System.out.println("4. Status");
			System.out.println("5. Exit");
			
			int op = input.nextInt();
			return op;
		}

	}