package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Main_Exadecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print(" Number in Hexadecilam:");
		String hex = input.next();
		
		System.out.println(hex+ " = "+toDecimal(hex.toUpperCase()));

	}
	
	public static int toDecimal(String hex) {
		int base = 16;
		int decimal =0;
		for (int i =0,exp = hex.length()-1;i<hex.length();i++,exp--) {
			char c = hex.charAt(i);
			decimal +=(int) Math.pow(base, exp)*getValue(c);
			
		}
		return decimal;
	}
	
	public static int getValue(char c) {
		if (c >='0' && c <= '9')
			return c-48;
		else
			return c-65+10;
	}
}