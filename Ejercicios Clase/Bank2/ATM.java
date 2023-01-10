package Bank2;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Bank b = new Bank("BBVA");
		final String admin = "123";
		String contraseña = "";
		System.out.println("Introduce la contraseña");
		contraseña = input.next();

		admin(admin, contraseña, b);

		autentificacion(b);
		
		System.out.println("Ha salido del Sistema");
	}

	public static void admin(String a, String b, Bank banco) {
		Scanner input = new Scanner(System.in);
		int s = 0;

		if (a.equals(b)) {
			System.out.println("Bienvenido al Banco BBVA");

			while (s != 4) {
				s = menuBanco();
				switch (s) {
				case 1:
					banco.Alta();
					break;
				case 2:
					banco.Baja();
					break;
				case 3:
					banco.getCuentas();
					System.out.println(banco.getNumeroCuentas());
					break;
				case 4:
					break;
				}
			}
		}
	}

	public static void autentificacion(Bank banco) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		while (a != 2) {
			a = menuUsuario();
			switch (a) {
			case 1:
				System.out.println("Inserte el Usuario: ");
				String usuario = input.next();
				System.out.println("Inserte la contraseña: ");
				String contraseñaUsuario = input.next();
				for (int i = 0; i < banco.getNumeroCuentas(); i++) {
					String u = banco.cuentas[i].getTitular().getName();
					String c = banco.cuentas[i].getTitular().getPassword();
					if (u.equals(usuario) && c.equals(contraseñaUsuario)) {
						cajero(i,banco);
					}else System.out.println("Error, vuelva a introducir sus datos.");
				}break;
			case 2:
				break;
			}
		}
	}
	
	public static void cajero(int numeroBank,Bank b) {
		System.out.println("Bienvenido " + b.cuentas[numeroBank].getTitular().getName());
		Scanner input = new Scanner(System.in);
		int a = 0;
		while (a != 4) {
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
	public static int menuCajero() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Informacion de la cuenta");
		System.out.println("2. Ingresar");
		System.out.println("3. Retirar");
		System.out.println("4. Salir.");
		int op = input.nextInt();
		return op;
	}

	public static int menuUsuario() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al banco BBVA");
		System.out.println("1. Acceder a una cuenta bancaria");
		System.out.println("2. Salir.");
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