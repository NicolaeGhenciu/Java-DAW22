package Objetos;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10,5);
		Rectangle r2 = new Rectangle(10,5);
		Rectangle r3 = new Rectangle();
		r1.setAltura(0);
		System.out.println("La altura del Rectangle 1 es : " + r1.getAltura());
		System.out.println("La base del Rectangle 2 es : " + r2.getBase());
		System.out.println("El area del Rectangle 1 es : " + r1.area());
		System.out.println("El parametro del Rectangle 1 es : " + r2.area());
		
		System.out.println(r2.equals(r1));
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

}
