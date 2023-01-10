package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Main_Prime {
	
	public static void main(String[] args) {

	int num = 0;
	int count = 0;

	while(count<50) {
		++num;
		if (isPrime(num)) {
			System.out.println(num + "\t");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}
	}
}

	public static boolean isPrime(int num) {
		boolean isPrime =true;
		for (int divisor = 2; divisor <= num / 2 && isPrime; divisor++)
				if (num % divisor == 0)
					isPrime = false;
		return isPrime;
	}
}
