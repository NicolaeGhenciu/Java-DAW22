package Bank;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Bank b = new Bank("BBVA");

		Scanner input = new Scanner(System.in);
		final String ADMIN = "123";
		String contraseña = "";
		System.out.println("Introduce la contraseña");
		contraseña = input.next();

		int a = 0;
		boolean iguales = false;
		int numeroBank = 0;

		if (ADMIN.equals(contraseña)) {
			System.out.println("Bienvenido al Banco BBVA");
			admin(b, a);
		}

		numeroBank = autentificacion(b, iguales, numeroBank);
		
		
		while (iguales = true) {
			a = menuCajero();
			switch (a) {
			case 1:
				System.out.println(b.cuentas[numeroBank].toString());
				break;
			case 2:
				System.out.println("Actualmente tiene : " + b.cuentas[numeroBank].getSaldo() + " €");
				System.out.println("Cantidad a Ingresar: ");
				int dinero = input.nextInt();
				b.cuentas[numeroBank].ingresarDinero(dinero);
				System.out.println("Actualmente tiene : " + b.cuentas[numeroBank].getSaldo() + " €");
				break;
			case 3:
				System.out.println("Actualmente tiene : " + b.cuentas[numeroBank].getSaldo() + " €");
				System.out.println("Cantidad a Retirar: ");
				dinero = input.nextInt();
				b.cuentas[numeroBank].retirarDinero(dinero);
				System.out.println("Actualmente tiene : " + b.cuentas[numeroBank].getSaldo() + " €");
				break;
			case 4:
				break;
			}
		}
	}

	public static int autentificacion(Bank b, boolean iguales, int numeroBank) {
		Scanner input = new Scanner(System.in);
		int a;
		while (iguales==false) {
			a = menuUsuario();
			switch (a) {
			case 1:
				System.out.println("Inserte el Usuario: ");
				String usuario = input.next();
				System.out.println("Inserte la contraseña: ");
				String contraseñaUsuario = input.next();
				for (int i = 0; i < b.cuentas.length; i++) {
					if (b.cuentas[i].getTitular().equals(usuario)
							&& b.cuentas[i].getPassword().equals(contraseñaUsuario)) {
						iguales = true;
						numeroBank = i;
						System.out.println("Bienvenido : " + b.cuentas[i].getTitular());
					}
				}
			case 2:
			}
		}
		return numeroBank;
	}

	public static void admin(Bank b, int a) {
		while (a != 4) {
			a = menuBanco();
			switch (a) {
			case 1:
				b.Alta();
				break;
			case 2:
				b.Baja();
				break;
			case 3:
				b.getCuentas();
				break;
			case 4:
				break;
			}
		}
	}

	public static int menuUsuario() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Acceder a una cuenta bancaria");
		System.out.println("2. Salir.");
		int op = input.nextInt();
		return op;
	}

	public static int menuCajero() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Informacion de la cuenta");
		System.out.println("2. Ingresar");
		System.out.println("3. Retirar");
		System.out.println("4. Salir.");
		int op = input.nextInt();
		return op;
	}

	public static int menuBanco() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Dar de Alta Cuenta");
		System.out.println("2. Dar de Baja Cuenta");
		System.out.println("3. Ver Cuentas");
		System.out.println("4. Salir del modo Admin");
		int op = input.nextInt();
		return op;
	}
}
