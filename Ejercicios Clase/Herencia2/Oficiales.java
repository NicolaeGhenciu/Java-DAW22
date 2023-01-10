package Herencia2;

public class Oficiales extends Empleado {

	private double plus;
	private String tipoOficial;

	public Oficiales(String name, String tel, String email, double salary, double plus, String tipoOficial) {
		super(name, tel, email, salary);
		this.plus = plus;
		this.tipoOficial = tipoOficial;
	}
	@Override
	public String toString() {
		return "Oficiales [plus=" + plus + ", tipoOficial=" + tipoOficial + "]";
	}

	public double getPlus() {
		return plus;
	}

	public void setPlus(double plus) {
		this.plus = plus;
	}

	public String getTipoOficial() {
		return tipoOficial;
	}

	public void setTipoOficial(String tipoOficial) {
		this.tipoOficial = tipoOficial;
	}

}
