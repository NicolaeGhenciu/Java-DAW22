package Objetos;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[5];
		int op = 0;
		while (op < 3) {
			op = menu();
			switch (op) {
			case 1:
				introPeople(people);

				break;
			case 2:
				System.out.println(listYoungerPeople(people));

				break;
			}

		}
	}

	public static String listYoungerPeople(Person[] p) {
		String report="\nList Younger People\n\tName\tAge\tTelf\n";
		
		for (int i = 0; i < p.length; i++) {
			if (!p[i].isAdult())
					report += p[i].toString();
		}
		return report;
	}

	public static void introPeople(Person[] p) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("-----Datos de la persona ------");

		for (int i = 0; i < p.length; i++) {
			System.out.println();
			System.out.print("Name :");
			String n = input.next();
			System.out.print("Telf :");
			String t = input.next();
			System.out.print("Age :");
			int a = input.nextInt();
			p[i] = new Person(n, t, a);
		}
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("-----Menu ------");
		System.out.println("1 .- Initializing arrays People ");
		System.out.println("2 .- Younger People  ");
		System.out.println("3 .- Exit  ");
		System.out.print("OPtion: ");
		int op = input.nextInt();
		return op;
	}
}
