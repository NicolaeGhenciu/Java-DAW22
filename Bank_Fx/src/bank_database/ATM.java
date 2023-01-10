package bank_database;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class ATM {

	public static void main(String[] args) throws SQLException {

		try {
			Scanner input = new Scanner(System.in);
			DbJava b = new DbJava();
			b.conectar();
/*
			final String admin = "123";
			String contraseña = "";
			System.out.println("Introduce la contraseña para el modo ADMIN");
			contraseña = input.next();

			if (admin.equals(contraseña))
				admin(b, input);
*/
			autentificacion(b, input);

			System.out.println("Ha salido del Sistema");

		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
	}

	public static void admin(DbJava b1, Scanner input) throws SQLException {

		try {
			int s = 0;
			System.out.println("Bienvenido al Banco BBVA");

			while (s != 8) {
				s = menuBanco();
				switch (s) {
				case 1:
					System.out.println("Introduzca el nombre del Usuario: ");
					String nombre = input.next();
					System.out.println("Introduzca el dni del Usuario: ");
					String dni = input.next().toUpperCase();
					System.out.println("Introduzca el email del Usuario: ");
					String email = input.next().toLowerCase();
					System.out.println("Introduzca la contraseña del Usuario: ");
					String contraseña = input.next();
					b1.addUser(new Person(nombre, dni, email, contraseña));
					break;
				case 2:
					System.out.println("Introduzca el dni del Usuario que desea borrar: ");
					String dniBorrar = input.next().toUpperCase();
					b1.deleteUser(dniBorrar);
					break;
				case 3:
					System.out.println("Dni: ");
					String dniNewCuenta = input.next().toUpperCase();
					b1.addAccount(new BankAccount(dniNewCuenta));
					break;
				case 4:
					System.out.println("Iban: ");
					String iban = input.next();
					b1.deleteAccount(iban);
					break;
				case 5:
					System.out.println(b1.getAllUsers());
					break;
				case 6:
					System.out.println(b1.getAllAccounts());
					break;
				case 7:
					System.out.println(b1.getAllRegistro());
				}
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
	}

	public static void autentificacion(DbJava b1, Scanner input) throws SQLException {
		try {
			int a = 0;
			while (a != 2) {
				a = menuUsuario();
				switch (a) {
				case 1:
					System.out.println("Inserte el dni: ");
					String dni = input.next().toUpperCase();
					System.out.println("Inserte la contraseña: ");
					String pass = input.next();
					
					if(dni.equals("ADMIN") && pass.equals("admin")) {
						admin(b1, input);
					}

					if (b1.getUsuarioPassword(dni, pass) == null) {
						System.out.println("Usuario no existe");
					} else {
						if (dni.equals(b1.getUsuarioPassword(dni, pass).getDni())
								&& pass.equals(b1.getUsuarioPassword(dni, pass).getPassword())) {
							String nombre = b1.getUsuarioPassword(dni, pass).getNombre();
							cajero(dni, nombre, pass, b1, input);
						}
					}
				case 2:
					break;
				}
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
	}

	public static void cajero(String dni, String nombre, String pass, DbJava b1, Scanner input) throws SQLException {
		try {
			System.out.println("Bienvenido " + nombre);
			System.out.println("Estas son las cuentas que tiene a su nombre: ");
			System.out.println(b1.getAllIban(dni));
			System.out.println("¿A que cuenta quieres acceder?\n Inserta el IBAN: ");
			String iban = input.next().toUpperCase();

			String transferencia = "Transferencia";
			String ingreso = "Ingreso";
			String retirada = "Retirada";
			int id = 0;

			if (b1.getAccount(iban, dni) != null) {

				int a = 0;
				while (a != 6) {
					a = menuCajero();
					switch (a) {
					case 1:
						System.out.println("Informacion de Usuario: ");
						System.out.println(b1.getUsuarioPassword(dni, pass));
						System.out.println("Informacion de Cuenta: ");
						System.out.println(b1.getAccount(iban, dni));
						break;
					case 2:
						float saldoActual = b1.getAccount(iban, dni).getSaldo();
						System.out.println("Actualmente tiene : " + saldoActual + " €");
						System.out.println("Cantidad a Ingresar: ");
						float cantidadIngresar = input.nextFloat();
						float dinero = saldoActual + cantidadIngresar;
						b1.saldo(iban, dinero);
						System.out.println("Actualmente tiene : " + b1.getAccount(iban, dni).getSaldo() + " €");

						b1.addRegistro(new Registro(id, fecha(), ingreso, iban, iban, cantidadIngresar));
						break;
					case 3:
						float saldoActualr = b1.getAccount(iban, dni).getSaldo();
						System.out.println("Actualmente tiene : " + saldoActualr + " €");
						System.out.println("Cantidad a Retirar: ");
						float cantidadRetirar = input.nextFloat();

						if (saldoActualr >= cantidadRetirar) {
							float dineror = saldoActualr - cantidadRetirar;
							b1.saldo(iban, dineror);
							System.out.println("Actualmente tiene : " + b1.getAccount(iban, dni).getSaldo() + " €");
							b1.addRegistro(new Registro(id, fecha(), retirada, iban, iban, cantidadRetirar));
						} else
							System.out.println("No tiene fondos");
						break;
					case 4:
						System.out.println("¿Que cantidad quiere enviar?");
						float cantidadEnviar = input.nextFloat();
						if (b1.getAccount(iban).getSaldo() < cantidadEnviar) {
							System.out.println("No tiene fondos suficientes");
							break;
						} else {
							System.out.println("Cuentas Disponibles para enviar: ");
							System.out.println(b1.getAllIban());
							System.out.println("¿A que cuenta quiere enviarlo?");
							String ibanEnviar = input.next().toUpperCase();

							if (b1.getAccount(ibanEnviar) == null) {
								System.out.println("Error");
								break;
							} else {
								float saldoactualenvio = cantidadEnviar + b1.getAccount(ibanEnviar).getSaldo();
								b1.saldo(ibanEnviar, saldoactualenvio);
								float saldoPostEnvio = b1.getAccount(iban).getSaldo() - cantidadEnviar;
								b1.saldo(iban, saldoPostEnvio);
								b1.addRegistro(
										new Registro(id, fecha(), transferencia, iban, ibanEnviar, cantidadEnviar));
							}
						}
						break;
					case 5:
						System.out.println(b1.getAllRegistro(iban, iban));
						break;
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
	}

	public static Date fecha() {
		Date fecha = new Date();
		long timeInMilliSeconds = fecha.getTime();
		java.sql.Date fecha1 = new java.sql.Date(timeInMilliSeconds);
		return fecha1;
	}

	public static int menuCajero() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Informacion de la cuenta");
		System.out.println("2. Ingresar");
		System.out.println("3. Retirar");
		System.out.println("4. Transferencia");
		System.out.println("5. Ver registro de operaciones");
		System.out.println("6. Salir.");
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
		System.out.println("1. Dar de Alta a un Usuario");
		System.out.println("2. Dar de Baja a un Usuario");
		System.out.println("3. Dar de Alta Cuenta");
		System.out.println("4. Dar de Baja Cuenta");
		System.out.println("5. Ver todos los Usuarios");
		System.out.println("6. Ver todas las Cuentas");
		System.out.println("7. Ver todas las Operaciones");
		System.out.println("8. Salir del modo Admin");
		int op = input.nextInt();
		return op;
	}

}