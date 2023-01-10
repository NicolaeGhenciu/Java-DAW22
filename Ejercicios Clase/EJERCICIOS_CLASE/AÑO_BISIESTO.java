package EJERCICIOS_CLASE;

import java.util.Scanner;

public class AÑO_BISIESTO {
	
	public static void main(String[] args){
	      int año;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      año = sc.nextInt();

	      if (((año % 4 == 0) && (año % 100!= 0)) || (año%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	      
	}
}
