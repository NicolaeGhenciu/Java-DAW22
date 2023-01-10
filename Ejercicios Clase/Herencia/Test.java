package Herencia;

public class Test {
	public static void main(String[] args) {
		Person p = new Person ("Pepe","1234","elcorreo");
		System.out.println(p);
		
		Empleado e = new Empleado("Andres","123","elcorreo2",2500);
		System.out.println(e);
		
		Client c = new Client("RafaCovid","12345","elcorreo3","cupon");
		System.out.println(c);
	}
}
