package bank_database;

public class Person {
	private String nombre;
	private String dni;
	private String email;
	private PassWord password;

	public Person(String nombre, String dni, String email, String pass) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.password = new PassWord();
		this.password.setPassword(pass);
	}

	public Person() {

	}

	public boolean equals(Person p) {
		if (this.email.equals(p.email) && this.getPassword().equals(p.getPassword()))
			return true;
		return false;
	}

	public boolean equalsDni(String dni) {
		if (this.dni.equals(dni))
			return true;
		return false;
	}

	public boolean equalsDni(Person person) {
		return this.dni.equals(getDni());
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", password=" + getPassword() + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password.getPassword();
	}

	public void setPassword(PassWord password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
