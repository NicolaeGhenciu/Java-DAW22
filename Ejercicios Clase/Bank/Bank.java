package Bank;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bank {

	private String nombreBanco;
	public BankAccount[] cuentas;
	private int numeroCuentas;

	public Bank(String nombreBanco) {
		this.nombreBanco = nombreBanco;
		this.cuentas = new BankAccount[3];
		this.numeroCuentas = 0;

	}
	
	public BankAccount[] Alta() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserte el nombre del titular");
		String titular = input.next();
		BankAccount alta = new BankAccount(titular);
		System.out.println("La contraseña generada ha sido " + alta.getPassword());
		System.out.println("El iban de la cuenta es: " + alta.getIban());
		this.cuentas[numeroCuentas] = alta;
		this.numeroCuentas++;
		return cuentas;	
	}
	
	public void Baja() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el IBAN de la cuenta que quieres dar de baja");
		String iban = input.next();
		
		for (int i = 0; i < this.numeroCuentas; i++) {
			if (this.cuentas[i].getIban().equals(iban)) {
				this.cuentas[i] = null;
			}
		}
	}
	public int isEnroll(String name) {

		for (int i = 0; i < this.numeroCuentas; i++)

			if (cuentas[i].equals(name))
				
				return i;

		return -1;

	}

	@Override
	public String toString() {
		return "Bank [nombreBanco=" + nombreBanco + ", cuentas=" + Arrays.toString(cuentas) + ", numeroCuentas=" + numeroCuentas
				+ "]";
	}

	public String getNombre() {
		return nombreBanco;
	}

	public void setNombre(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public int getNumeroCuentas() {
		return numeroCuentas;
	}

	public void setNumeroCuentas(int numeroCuentas) {
		this.numeroCuentas = numeroCuentas;
	}

	public void getCuentas() {
		for (int i = 0; i < this.cuentas.length; i++) {
			if(this.cuentas[i] != null)
				System.out.println(this.cuentas[i]);
		}
	}

	public void setCuentas(BankAccount[] cuentas) {
		this.cuentas = cuentas;
	}
	
}
