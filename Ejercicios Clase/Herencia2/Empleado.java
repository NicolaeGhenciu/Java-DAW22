package Herencia2;

public class Empleado extends Persona{
	private double salary;
	
	public Empleado(String name, String tel, String email, double salary) {
		super(name,tel,email);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [salary=" + salary + "]";
	}
}
