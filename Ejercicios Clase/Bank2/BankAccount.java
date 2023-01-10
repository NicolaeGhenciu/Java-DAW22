package Bank2;

import java.util.Random;

public class BankAccount {

	private String iban;
	private Person titular;
	private double saldo;

	public BankAccount(Person titular) {
		this.iban = generarIBAN();
		this.titular = titular;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "BankAccount [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	public Person getTitular() {
		return titular;
	}

	public void setTitular(Person titular) {
		this.titular = titular;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public double retirarDinero(double cantidad) {
		this.saldo = saldo - cantidad;
		return saldo;
	}

	public double ingresarDinero(double cantidad) {
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