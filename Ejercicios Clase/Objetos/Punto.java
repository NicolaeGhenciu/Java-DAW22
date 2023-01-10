package Objetos;

public class Punto {
	private double x;
	private double y;

	public Punto() {

	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public double distance(double x, double y) {
		double c1 = this.x - x;
		double c2 = this.y - y;
		return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	}

	public double distance(Punto p) {
		double c1 = this.x - p.x;
		double c2 = this.y - p.y;
		return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	}
}
