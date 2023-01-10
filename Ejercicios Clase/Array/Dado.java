package Array;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Cuantas veces quieres tirar?");
		int veces = input.nextInt();
		
		int[] contador = new int[6];

		for (int i = 0; i < veces; i++) {//cuenta lasveces que tiramos
			int valor = (int) (Math.random() * 6+1);
			contador[valor-1]++;
		}
		imprimir(contador);
		}

	public static void imprimir(int[] c) {
		 for(int i=0;i<c.length;i++) {
	            System.out.println("El "+(i+1)+ " ha salido "+c[i]+ " veces"); }
		
	}
				}
