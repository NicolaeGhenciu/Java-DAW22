package Objetos;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		
		Persona [] person = new Persona[10];
		Persona p1 = new Persona("Nicolae ", "645648949", 23);
		Persona p2 = new Persona("Angelica", "644555668", 20);
		Persona p3 = new Persona("Elshisha ", "642555888", 20);
		Persona p4 = new Persona("Rafa", "645555611", 20);
		Persona p5 = new Persona("Teban ", "642366987", 19);
		person [0] = p1;
		person [1] = p2;
		person [2] = p3;
		person [3] = p4;
		person [4] = p5;
		
		Scanner input = new Scanner(System.in);
		int op = 0;

		while (op < 6) {
			op = menu();
			switch (op) {
			case 1:System.out.println("¿Es mayor de Edad? : "+ p1.MayorEdad(p1.edad));break;
			case 2:
			case 3:
			case 4:
			}
		}
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int op = input.nextInt();
		return op;
	}
}

