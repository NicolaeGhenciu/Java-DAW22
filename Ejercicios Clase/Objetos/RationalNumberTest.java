package Objetos;

public class RationalNumberTest {

	public static void main(String[] args) {
		
		RationalNumber f1 = new RationalNumber(5,10);
		RationalNumber f2 = new RationalNumber(1,5);
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println("\n");
		
		System.out.println(f1.sumaFraccionesNumerador(1, 5));
		System.out.println("----");
		System.out.println(f1.sumaFraccionesDenominador(5));
		System.out.println("\n");
		System.out.println(f1.sumaFraccionesNumerador(f2));
		System.out.println("----");
		System.out.println(f1.sumaFraccionesDenominador(f2));
		System.out.println(f1.mcm(5));

	}

}
