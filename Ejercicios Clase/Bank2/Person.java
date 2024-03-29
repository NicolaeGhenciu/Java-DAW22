package Bank2;

import java.util.Random;

public class Person {
	private String name;
	private String dni;
	private String password;

	public Person(String name, String dni) {
		this.name = name;
		this.dni = dni;
		this.password = generarContraseņa();
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dni=" + dni + ", password=" + password + "]";
	}

	public boolean equalsDni(Person person) {
		return this.dni.equals(getdni());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		this.dni = dni;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String generarContraseņa() {
		Random r = new Random();
		String contraseņa = "";
		for (int i = 0; i < 3; i++) {
			int random = r.nextInt(9);
			contraseņa = contraseņa + random;
		}
		return contraseņa;
	}

}