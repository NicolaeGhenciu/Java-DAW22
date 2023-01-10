package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Main_MaximoComunDivisor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number 1:");
		int num1 = input.nextInt();
		System.out.println("Number 2:");
		int num2 = input.nextInt();
		
		String label ="g.c.d.("+num1+","+num2+") =";
		System.out.println(label + gcd(num1,num2));
	}
	
	public static int gcd(int num1, int num2) {

		int by = (num1 < num2) ? num1 : num2;

		while (num1 % by != 0 || num2 % by != 0)
			by--;
		return by;
	}

}
