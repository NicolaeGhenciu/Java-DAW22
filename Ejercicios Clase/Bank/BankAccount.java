package Bank;

import java.util.Random;

public class BankAccount {

	private String iban;
	private String titular;
	private double saldo;
	private String password;

	public BankAccount(String titular) {
		this.iban = generarIBAN();
		this.titular = titular;
		this.saldo = 0;
		this.password = generarContraseña();
	}

	@Override
	public String toString() {
		return "BankAccount [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + ", password=" + password
				+ "]";
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double retirarDinero(double cantidad) {
		this.saldo = saldo - cantidad;
		return saldo;
	}

	public double ingresarDinero(double cantidad) {
		this.saldo = saldo + cantidad;
		return saldo;
	}
	
	public String generarContraseña() {
		Random r = new Random();
		String contraseña = "";
		for (int i = 0; i < 3; i++) {
			int random = r.nextInt(9);
			contraseña = contraseña + random;
		}
		return contraseña;
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