package Herencia2;

public class Obreros extends Empleado{
	private double horas;

	public Obreros(String name, String tel, String email, double salary, double horas) {
		super(name, tel, email, salary);
		this.horas = horas;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Obreros [horas=" + horas + "]";
	}

}
