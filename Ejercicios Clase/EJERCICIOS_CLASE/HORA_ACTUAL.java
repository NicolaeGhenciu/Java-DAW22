package EJERCICIOS_CLASE;

public class HORA_ACTUAL {
	public static void main(String[] args) {
		
		long totalmilisegundos = System.currentTimeMillis();
		long totalsegundos = totalmilisegundos / 1000;
		totalsegundos = totalsegundos % (24 * 60 * 60);
		long currenthour = totalsegundos / (60 *60) + 2;
		totalsegundos = totalsegundos % (60 * 60);
		long currentminutes = totalsegundos / 60;
		totalsegundos = totalsegundos % 60;
		
		System.out.println("Current time is:  " + currenthour + ":" + currentminutes + ":" + totalsegundos + "  GTM");
		
	}

}
