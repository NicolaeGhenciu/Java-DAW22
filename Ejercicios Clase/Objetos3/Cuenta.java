package Objetos3;

public class Cuenta {
	private String titular;
	private double saldo;
	private int cuenta;

	public Cuenta(String tit, int num, double din) {
		titular = tit;
		saldo = din;
		cuenta = num;
	}

	public Cuenta(String tit, int num) {
		titular = tit;
		saldo = 0;
		cuenta = num;
	}

	public void ingreso(double cant) {
		saldo += cant;
	}

	public void debito(double cant) {
		saldo -= cant;
	}

	public String titular() {
		return titular;
	}

	public double saldo() {
		return saldo;
	}

	public int cuenta() {
		return cuenta;
	}

	public String toString() {
		return titular + " con numero de cuenta " + cuenta + " tiene " + saldo + "€";
	}
}