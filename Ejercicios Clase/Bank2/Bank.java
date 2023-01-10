package Bank2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bank {

	private String nombreBanco;
	private int numeroCuentas;
	protected BankAccount[] cuentas;

	public Bank(String nombreBanco) {
		this.nombreBanco = nombreBanco;
		this.cuentas = new BankAccount[3];
		this.numeroCuentas = 0;

	}
	
	public BankAccount[] Alta() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserte el nombre del titular");
		String titular = input.next();
		System.out.println("Inserte el DNI");
		String dni = input.next();
		Person p = new Person(titular, dni);
		BankAccount alta = new BankAccount(p);
		System.out.println("La contraseña generada ha sido " + p.getPassword());
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
				this.numeroCuentas--;
			}
		}
	}
	public boolean addAccount(BankAccount cn) {
		if (this.existe(cn) >= 0)
			return false;
		if (this.cuentas.length == this.numeroCuentas)
			return false;
		
		return false;
	}
	public int existe(BankAccount cn) {
		for (int i = 0; i < this.numeroCuentas; i++)
			if (cuentas[i].getIban().equals(cn.getIban()))
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
	
	public boolean igual(String name, int i, String contraseña) {
		boolean a = false;
		if(cuentas[i].getTitular().getName() == name && cuentas[i].getTitular().getPassword() == contraseña)
		a = true;
		
		return a;
	}
	
}
