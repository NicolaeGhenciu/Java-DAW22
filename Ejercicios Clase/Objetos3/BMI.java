package Objetos3;

public class BMI {
	String nombre;
	int edad;
	double altura;
	double peso;

	public BMI(String nombre, int edad, double altura, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	public BMI() {
		this(null, 20, 1.75, 80);
	}

	public double getBMI() {
		double IMC = peso / Math.pow(altura, altura);
		return IMC;
	}

	public void getStatus() {
		if (getBMI() < 18.5)
			System.out.println("Underweight");
		else if (getBMI() < 25)
			System.out.println("Normal");
		else if (getBMI() < 30)
			System.out.println("Overweight");
		else if (getBMI() < 100)
			System.out.println("Obese");
	}

	@Override
	public String toString() {
		return "BMI [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}