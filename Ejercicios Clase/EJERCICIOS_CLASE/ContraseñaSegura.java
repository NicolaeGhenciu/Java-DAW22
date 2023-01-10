package EJERCICIOS_CLASE;

import java.util.Scanner;

public class ContraseñaSegura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Register:");
		System.out.println("--------");
		System.out.print("User name:");
		String user = input.next();

		boolean isLong;
		boolean isLetter;
		boolean isNumber;
		String pass;
		String pass2;
		do {// Repite contrase�a
			do {// se asegura contrase�a regura
				isLong = false;
				isLetter = false;
				isNumber = false;
				System.out.print("User password:");
				pass = input.next();
				if (pass.length() >= 8)
					isLong = true;
				for (int i = 0; i < pass.length(); i++) {
					char car = pass.charAt(i);
					if (car >= '0' && car <= '9')
						isNumber = true;
					if ((car >= 'a' && car <= 'z') || car >= 'A' && car <= 'Z')
						isLetter = true;
				}
				System.out.println(isLong + " " + isLetter + " " + isNumber);
				if (!isLong)
					System.out.println("At least 8 characters");
				if (!isLetter)
					System.out.println("At least one letter");
				if (!isNumber)
					System.out.println("At least one number");
			} while (!(isLong && isLetter && isNumber));// !isLong || !isLetter || !isNumber
			System.out.print("Repeat password:");
			pass2 = input.next();
		} while (!pass.equals(pass2));
		System.out.println("Welcome " + user);
	}

}
