package EJERCICIOS_CLASE;

import java.util.Scanner;

public class A�O_BISIESTO {
	
	public static void main(String[] args){
	      int a�o;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      a�o = sc.nextInt();

	      if (((a�o % 4 == 0) && (a�o % 100!= 0)) || (a�o%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	      
	}
}
