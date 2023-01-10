package Objetos;

public class PuntoTest {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(10,5);
		Punto p2 = new Punto(9,4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.getX());
		System.out.println(p2.getY());
		
		System.out.println(p1.distance(0, 0));
		System.out.println(p1.distance(p2));
	}

}
