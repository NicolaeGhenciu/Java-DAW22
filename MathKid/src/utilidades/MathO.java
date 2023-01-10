package utilidades;

import java.util.ArrayList;
import java.util.Date;

public class MathO {

	private int intentos = 0;
	private int triplete = 0;
	private int tripleteTotal = 0;
	private String contador;
	private int fallos = 0;
	private int numeroUno;
	private int numeroDos;
	private int resultado;
	private ArrayList<String> problemas;
	private ArrayList<Integer> soluciones;

	public MathO() {

	}

	public String getProblema(int i) {
		problemas = new ArrayList<String>();
		problemas.add(
				"Esteban tenia 85 cromos de una colección de futbol\n y sus amigos le regalan 11 cromos de animales.\n ¿Cuantos cromos juntara Esteban?");
		problemas.add(
				"Dentro de una cesta hay 74 cangrejos y se salieron 4\n. ¿Cuantos cangrejos quedaron en la cesta?");
		problemas.add("En una caja hay 36 anillos y en otra 31. \n¿Cuantos anillos reúnen entre las dos cajas?");
		problemas.add("En una plaza hay 46 golondrinos y 2 salen volando. \n¿Cuantos golondrinos quedan en la plaza?");
		problemas.add(
				"En un espectaculo habia 81 personas \ny han entrado 45 más. \n¿Cuantas personas habrá ahora en el espectaculo?");
		problemas.add(
				"El libro de historia tiene 55 hojas y el de arte 51.\n ¿Cuantas hojas tiene el primer libro más que el segundo?");
		problemas.add(
				"En un cine con capacidad de 89 personas, ya han entrado 45.\n ¿Cuantas personas tienen que entrar para llenar el cine ?");
		problemas.add(
				"Mi hermano tiene 58 bolitas transparentes y yo 7 marrones.\n ¿Cuantas bolitas tenemos entre los dos?");
		problemas.add("Me faltan 24 euros para comprar una mochila que vale 89 euros.\n ¿Cuanto dinero tengo?");
		problemas.add(
				"En el parque de Tomelloso hay 219 arboles y en el parque de Daimiel hay 635.\n ¿Cuantos arboles hay entre los dos parques?");
		// problemas.add("");
		return problemas.get(i);
	}

	public int getSolucionProblemas(int i) {
		soluciones = new ArrayList<Integer>();
		soluciones.add(96);
		soluciones.add(70);
		soluciones.add(67);
		soluciones.add(44);
		soluciones.add(126);
		soluciones.add(4);
		soluciones.add(44);
		soluciones.add(65);
		soluciones.add(65);
		soluciones.add(854);
		// soluciones.add();
		return soluciones.get(i);
	}

	public String getContador() {
		++intentos;
		contador = intentos + " de 10";
		return contador;
	}

	public int genNumeroUno(int valor) {
		numeroUno = getNumeroAleatorio(numeroUno, valor);
		return numeroUno;
	}

	public int genNumeroDos(int valor) {
		numeroDos = getNumeroAleatorio(numeroDos, valor);
		return numeroDos;
	}

	public void getAjuste() {
		if (numeroUno < numeroDos) {
			int a = numeroUno;
			numeroUno = numeroDos;
			numeroDos = a;
		}
	}

	public void getNoIgual(int resultado, int resultado2, int valor) {
		while (resultado == resultado2) {
			genNumeroUno(valor);
			genNumeroDos(valor);
		}
	}

	public void getAjusteDivisiones() {
		while (numeroUno % numeroDos != 0) {
			genNumeroUno(0);
			genNumeroDos(0);
		}
	}

	public int getNumeroAleatorio(int numero, int valor) {
		if (valor == 0) {
			switch (intentos) {
			case 0:
				numero = (int) (Math.random() * 10);
				break;
			case 1:
				numero = (int) (Math.random() * 10) + 1;
				break;
			case 2:
				numero = (int) (Math.random() * 10) + 1;
				break;
			case 3:
				numero = (int) (Math.random() * 50) + 1;
				break;
			case 4:
				numero = (int) (Math.random() * 90) + 1;
				break;
			case 5:
				numero = (int) (Math.random() * 100) + 1;
				break;
			case 6:
				numero = (int) (Math.random() * 100) + 1;
				break;
			case 7:
				numero = (int) (Math.random() * 100) + 1;
				break;
			case 8:
				numero = (int) (Math.random() * 1000) + 1;
				break;
			case 9:
				numero = (int) (Math.random() * 1000) + 1;
				break;
			}
		} else {
			numero = (int) (Math.random() * 10);
		}

		return numero;
	}

	public int getResultadoSuma() {
		resultado = numeroUno + numeroDos;
		return resultado;
	}

	public int getResultadoRestas() {
		resultado = numeroUno - numeroDos;
		return resultado;
	}

	public int getResultadoMultiplicaciones() {
		resultado = numeroUno * numeroDos;
		return resultado;
	}

	public int getResultadoDivisiones() {
		resultado = numeroUno / numeroDos;
		return resultado;
	}

	public static Date fecha() {
		Date fecha = new Date();
		long timeInMilliSeconds = fecha.getTime();
		java.sql.Date fecha1 = new java.sql.Date(timeInMilliSeconds);
		return fecha1;
	}

	public int getNumeroUno() {
		return numeroUno;
	}

	public int getNumeroDos() {
		return numeroDos;
	}

	public int getNumeroUnoM() {
		return numeroUno;
	}

	public int getNumeroDosM() {
		return numeroDos;
	}

	public int getTriplete() {
		return triplete;
	}

	public int getTripleteTotal() {
		return tripleteTotal;
	}

	public void sumTripleteTotal() {
		++tripleteTotal;
	}

	public void sumTriplete() {
		++triplete;
	}

	public void zeroTriplete() {
		triplete = 0;
	}

	public int getFallos() {
		return fallos;
	}

	public void sumFallos() {
		++fallos;
	}

	public int getIntentos() {
		return intentos;
	}

}