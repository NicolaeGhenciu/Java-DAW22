package Objetos2;

import java.util.Scanner;

public class TestRationalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ListOfRationalNumber list = new ListOfRationalNumber();

		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				RationalNumber f = newNumber("Kye a new rational number");
				list.add(f);
				break;

			case 2:
				System.out.println("List Of Rational Number:");
				System.out.println(list);
				break;
			case 3:
				System.out.println("Searching....");
				RationalNumber f2 = newNumber("Key the rational number to serch");
				int position = list.searchElement(f2);
				if (position == -1)
					System.out.println("The number is not in the list");
				else
					System.out.println("The numbre " + f2 + " is the list. Position :" + position);
				break;
			case 4:
				System.out.println("Deleting....");
				RationalNumber f3 = newNumber("Key the rational number to delete");
				if (list.deleteElement(f3))
					System.out.println(f3 + " has been deleted");
				else
					System.out.println("Sorry, " + f3 + " is not in the list");
			}
		} while (op != 5);

	}

	public static RationalNumber newNumber(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		System.out.println("Numerator:");
		int n = input.nextInt();

		System.out.println("Denominator:");
		int d = input.nextInt();
		return new RationalNumber(n, d);
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("______");
		System.out.println("1 .- Insert a rational number");
		System.out.println("2 .- Print List ");
		System.out.println("3 .- Search a rational number");
		System.out.println("4 .- Delete a rational number");
		System.out.println("5 .- Exit");
		System.out.println("Choose an option : ");
		int op = input.nextInt();
		return op;
	}

}
