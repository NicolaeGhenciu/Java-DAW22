package Objetos;

public class Rectangle {

	private double base;
	private double altura;
	
	public Rectangle () {
		
	}
	public Rectangle (double base, double altura) {
		this.altura = altura;
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double area() {
		double area = base * altura;
		return area;
	}
	public double perimetro() {
		return base*2*altura*2;
	}
	public boolean equals (Rectangle r) {
		if (this.area() == r.area())
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", altura=" + altura + "]";
	}
}
