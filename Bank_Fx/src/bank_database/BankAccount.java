package bank_database;

import java.util.Random;

public class BankAccount {

	private String iban;
	private String dni;
	private float saldo;

	public BankAccount() {
	}
	
	public BankAccount(String dni) {
		this.iban = generarIBAN();
		this.dni = dni;
		this.saldo = 0;
	}
	
	public BankAccount(String dni, float saldo) {
		this.iban = generarIBAN();
		this.dni = dni;
		this.saldo = saldo;
	}
	
	public BankAccount(String iban, String dni, float saldo) {
		this.iban = iban;
		this.dni = dni;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "BankAccount iban=" + iban + ", dni=" + dni + ", saldo=" + saldo + "\n";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public float getSaldo() {
		return saldo;
	}

	public float retirarDinero(float cantidad) {
		this.saldo = saldo - cantidad;
		return saldo;
	}

	public double ingresarDinero(float cantidad) {
		this.saldo = saldo + cantidad;
		return saldo;
	}

	public String generarIBAN() {
		Random r = new Random();
		iban = "ES";
		for (int i = 0; i < 4; i++) {
			int random = r.nextInt(9);
			iban = iban + random;
		}
		return iban;
	}
}