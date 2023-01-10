package Objetos2;

public class RationalNumber {
	private int numerator;
	private int denominator;

	public RationalNumber() {
		this(1, 1);
	}

	public RationalNumber(int n, int d) {
		this.numerator = n;
		this.denominator = d;
		Simplify();
	}

	public RationalNumber add(RationalNumber f) {
		int d = this.denominator * f.denominator;
		int n = this.numerator * f.denominator + this.denominator * f.numerator;
		return new RationalNumber(n, d);
	}

	public RationalNumber minus(RationalNumber f) {
		int d = this.denominator * f.denominator;
		int n = this.numerator * f.denominator - this.denominator * f.numerator;
		return new RationalNumber(n, d);
	}

	public RationalNumber multiply(RationalNumber f) {
		int d = this.denominator * f.denominator;
		int n = this.numerator * f.numerator;
		return new RationalNumber(n, d);
	}

	public RationalNumber divide(RationalNumber f) {
		int d = this.denominator * f.numerator;
		int n = this.numerator * f.denominator;
		return new RationalNumber(n, d);
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public double toDouble() {
		return (double) this.numerator / this.denominator;
	}

	private void Simplify() {
		int gcd = this.numerator < this.denominator ? this.numerator : this.denominator;
		while (!(this.numerator % gcd == 0 && this.denominator % gcd == 0))
			--gcd;
		this.denominator /= gcd;
		this.numerator /= gcd;
	}

	public boolean equals(RationalNumber f) {

		if (f.numerator * this.denominator == f.denominator * this.numerator)
			return true;
		return false;
	}

}
