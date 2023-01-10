package Objetos;

public class RationalNumber {

	private double numerator;
	private double denominator;

	public RationalNumber() {

	}

	@Override
	public String toString() {
		return "RationalNumber [numerator=" + numerator + ", denominator=" + denominator + "]";
	}

	public double getNumerator() {
		return numerator;
	}

	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}

	public double getDenominator() {
		return denominator;
	}

	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}

	public RationalNumber(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public double sumaFraccionesDenominador(double denominator) {
		double n1 = this.denominator * denominator;
		return n1;
	}

	public double sumaFraccionesDenominador(RationalNumber r) {
		double n1 = this.denominator * r.denominator;
		return n1;
	}

	public double sumaFraccionesNumerador(double numerator, double denominator) {
		double n1 = this.numerator;
		double n2 = this.denominator;
		return (n1 * denominator) + (n2 * numerator);
	}

	public double sumaFraccionesNumerador(RationalNumber r) {
		double n1 = this.numerator;
		double n2 = this.denominator;
		return (n1 * r.denominator) + (n2 * r.numerator);
	}

	public int mcm(double denominator) {
		int a = (int) this.denominator;
		int b = (int) denominator;
		int mcm = 1;
		int i = 2;
		while (i <= a || i <= b) {

			if (a % i == 0 || b % i == 0) {
				mcm = mcm * i;
				if (a % i == 0)
					a = a / i;
				if (b % i == 0)
					b = b / i;
			} else
				i = i + 1;
		}
		return mcm;
	}
}
