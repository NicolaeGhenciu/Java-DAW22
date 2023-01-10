package Objetos;

public class Persona {
	String nombre;
	String telefono;
	int edad;
	
	public Persona(String name, String tel, int age) {
		this.nombre = name;
		this.telefono = tel;
		this.edad = age;
	}
	
	public boolean MayorEdad(int e) {
		boolean a = false;
		if (e >= 18)
			a = true;
		return a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int e) {
		edad = e;
	}
}
