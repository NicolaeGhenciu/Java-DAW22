package EJERCICIOS_CLASE;

public class Numeros_primos_cincuenta {
	public static void main(String[] args) {
		
	int num = 1;// es primo
	int count = 0;
	
	while (count < 50) {
		++num;
	boolean esPrimo = true;
	for (int divisor = 2; divisor <= num / 2 && esPrimo; divisor++)
		if (num % divisor == 0)
			esPrimo = false;
	
		if (esPrimo ) {
			System.out.print(num+"\t");
			count++;
			if (count%10==0)
				System.out.println();
			}
		}
	}
}

