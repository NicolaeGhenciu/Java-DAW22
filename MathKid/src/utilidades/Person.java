package utilidades;

public class Person {
	private String nombre;
	private int edad;
	private String email;
	private PassWord password;

	public Person(String nombre, int edad, String email, String pass) {
		this.nombre = nombre;
		this.edad = edad;
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

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", email=" + email + ", password=" + getPassword() + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
