package Objetos2;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Person[] people = new Person[2];
		int op = 0;
		while (op < 4) {
			op = menu();
			switch (op) {
			case 1:
				introPeople(people);

				break;
			case 2:
				System.out.println(listPeople(people));

				break;
			case 3:
				System.out.println("Change password");
				System.out.println("Name:");
				String name = input.next();
				
				Person p = getPerson(name, people);
				if (p != null) {
					System.out.println(p.toString());
					System.out.println("Old passWord:" + p.getPassword().getPassword());
					System.out.println("New Password:");
					String pw = input.next();
					p.getPassword().setPassword(pw);
				}
				else
					System.out.println(name+ "is not membership");

				break;
			}

		}
	}

	public static Person getPerson(String name, Person[] people) {
		Person p = null;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getName().equals(name)) {
				return people[i];
			}
		}
		return p;
	}

	public static String listPeople(Person[] p) {
		String report = "\nList  People\n\tName\tAge\tTelf\tPassword\n";

		for (int i = 0; i < p.length; i++) {

			report += "\t" + p[i].toString() + "\n";
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
		System.out.println("2 .- Print people  ");
		System.out.println("3 .- Change Password");
		System.out.println("4 .- Exit  ");
		System.out.print("OPtion: ");
		int op = input.nextInt();
		return op;
	}
}
